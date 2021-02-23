package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите первое число диапазона");
        int a = num.nextInt();
        System.out.println("Введите второе число диапазона");
        int b = num.nextInt();
        if (a >= b ) {
            System.out.println("Некорректный ввод");
        } else {
            System.out.println("Диапазон чисел от " + a + " до " + b);
            int i = a;
            while (i < b) {
                if ( i % 5 == 0 && i % 10 > 0 && i > a ) {
                    System.out.print(i + " ");
                }
                i++;
            }
        }
    }
}
