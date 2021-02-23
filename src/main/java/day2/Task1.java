package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner floorsNum = new Scanner(System.in);
        System.out.println("Введите количество этажей дома");
        int x = floorsNum.nextInt();
        if (x >= 9) {
            System.out.println("Многоэтажный дом");
        } else if (x >= 5) {
            System.out.println("Среднеэтажный дом");
        } else if (x >= 1) {
            System.out.println("Малоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }

    }
}
