package day4;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
//        Ввод размера массива:
        System.out.println("Введите размер массива");
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];

//        Создание массива случайных чисел в диапазоне от 0 до 10:
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) array[i] = rand.nextInt(11);

        int moreThan_8 = 0;
        int equalTo_1 = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;

//        Проверка сгенерированного массива:
//        System.out.println(Arrays.toString(array));

        for (int i : array) {
            if (i > 8) moreThan_8++;
            if (i == 1) equalTo_1++;
            if (i % 2 == 0) even++;
            if (i % 2 != 0) odd++;
            sum += i;
        }

//        Информация о массиве:
        System.out.println("Длинна массива: " + arraySize);
        System.out.println("Количество чисел больше 8: " + moreThan_8);
        System.out.println("Количество чисел равных 1: " + equalTo_1);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
