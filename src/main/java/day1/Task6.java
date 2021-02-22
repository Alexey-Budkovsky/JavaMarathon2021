package day1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int k = 6;
        for (int i = 1;i < 11; i++){
            System.out.println(k + " x " + i + " = " + (k*i));
        }

        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое  натуральное число от 1 до 9");
        int num = input.nextInt();
        for (int i = 1;i < 11; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }

    }
}
