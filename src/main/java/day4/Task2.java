package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) array[i] = rand.nextInt(1001);

//        Проверка сгенерированного массива:
//        System.out.println(Arrays.toString(array));

        int maximum = array[0];
        int minimum = array[0];
        int end_0 = 0;
        int sumEnd_0 = 0;

        for (int i : array) {
            if (i > maximum) maximum = i;
            if (i < minimum) minimum = i;
            if (i % 10 == 0) end_0++;
            if (i % 10 == 0) sumEnd_0 += i;
        }
//        Информация о массиве:
        System.out.println("Наибольший элемент массива: " + maximum);
        System.out.println("Наименьший элемент массива: " + minimum);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + end_0);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumEnd_0);
    }
}
