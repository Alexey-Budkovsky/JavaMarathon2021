package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        Random rand = new Random();

        int sum = 0;
        int compare = 0;
        int indexArrLine = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(51);
                sum += array[i][j];
//                System.out.print(array[i][j] + " "); // Проверка сгенерированного массива
            }
//            System.out.println(); // Проверка сгенерированного массива
            if (compare < sum) {
                compare = sum;
                indexArrLine = i;
            }
            sum = 0;
        }
        System.out.println("Индекс строки с максимальной суммой чисел: " + indexArrLine);
    }
}
