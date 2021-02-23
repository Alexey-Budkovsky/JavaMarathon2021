package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число для вычисления значения \"y\" ");
        double x = input.nextDouble();
        double y = 0.0;

        if (x >= 5) {
            y = (Math.pow(x,2) - 10) / (x + 7);
        } else if ( -3 < x && x < 5) {
            y = (x + 3) * (Math.pow(x,2) - 2);
        } else {
            y = 420;
        }

        System.out.println("\"y\" равно " + y);
    }
}
