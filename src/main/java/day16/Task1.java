package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("file_for_Task1");
        printResult(file);


    }

    // В классе Task1 создать публичный статический метод printResult(File file)
    public static void printResult(File file) {
        // Scanner. Поверка на исключение FileNotFoundException
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("Файл не найден");
        }

        // Переменнная для временной строки
        String line = "";
        // Переменная для суммы чисел
        double sum = 0.0;
        // Переменная среднего арифметического чисел
        double arithmeticalMean = 0.0;
        // Переменная для общего количества чисел
        int index = 1;
        // Подсчет среднего арифметического чисел
        while (scanner.hasNext()) {
            line = scanner.next();
            sum += Integer.parseInt(line);
            arithmeticalMean = sum / index;
            index++;
        }
        // Закрытие потока Scanner
        scanner.close();

        // Вывод в консоль среднего арифметического чисел
        System.out.printf(arithmeticalMean + " --> %.3f", arithmeticalMean);

    }


}

