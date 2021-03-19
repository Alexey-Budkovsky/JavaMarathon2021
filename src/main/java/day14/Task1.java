package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file1 = new File("file_for_Task1");
        printSumDigits(file1);

    }

    public static void printSumDigits(File file) {
//Если файла не существует в папке проекта,
//в программе необходимо выбрасывать исключение
//и выводить в консоль сообщение “Файл не найден”.
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
            return;
        }

        String line = scanner.nextLine();
        String[] numString = line.split(" ");

        scanner.close();
//Помимо этого, если чисел в файле меньше или больше 10,
//необходимо выбрасывать исключение
//и выводить в консоль сообщение “Некорректный входной файл”.

//        System.out.println(numString.length);//Проверка

        if (numString.length != 10) {
            try {
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Некорректный входной файл");
            }
        }

//считает сумму всех чисел в этом файле и выводит ее на экран.
        int numSum = 0;
        for (String s : numString) {
            numSum += Integer.parseInt(s);
        }
        System.out.println(numSum);
    }

}
