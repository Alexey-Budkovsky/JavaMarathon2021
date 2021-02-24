package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i =0; i < 5; i++) {
            System.out.println("Введите число для делимого");
            double dividend = input.nextDouble();
            System.out.println("Введите число для делителя");
            double divider = input.nextDouble();
            if (divider == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(dividend / divider);
        }
    }
}
