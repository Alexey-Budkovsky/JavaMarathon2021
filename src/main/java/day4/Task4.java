package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) array[i] = rand.nextInt(10001);

//        Проверка сгенерированного массива:
//        System.out.println(Arrays.toString(array));

        int sum = 0;
        int compare = 0;
        int indexArrLine = 0;

//        Счетчик сумм "троек" значений в массиве
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i; j < i + 3; j++) {
//                System.out.print(j + ", "); // проверка тндексации "троек"
                sum += array[j];
            }
            if (compare < sum) {
                compare = sum;
                indexArrLine = i;
            }
            sum = 0;
//            System.out.println(); // проверка тндексации "троек"
        }
//        Максимальная сумма среди трех соседних элементов массива:
        System.out.println(compare);
//        Индекс первого элемента тройки:
        System.out.println(indexArrLine);
    }
}
