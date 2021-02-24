package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число для делимого");
            double dividend = input.nextDouble();
            System.out.println("Введите число для делителя");
            double divider = input.nextDouble();
            if (divider != 0) {
                System.out.println(dividend / divider);
            } else {
                break;
            }
        }
    }
}
