package day15;

import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // Создание объекта класса File для входящего документа
        String pathInput = "src/main/resources/shoes.csv";
        File fileInput = new File(pathInput);

        // Создание объекта класса Scanner для чтения строк из входящего документа
        // try/catch обработка исключения
        Scanner scanner = null;
        try {
            scanner = new Scanner(fileInput);
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("Файл не найден");
        }

        // Создание объекта класса File для исходящего документа
        String pathOutput = "src/main/resources/missing_shoes.txt";
        File fileOutput = new File(pathOutput);

        // Создание объекта класса PrintWriter для внесения строк в исходящий документ
        // try/catch обработка исключения
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(fileOutput);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Исходящий файл не найден");
        }

        // Создание временной строки
        String line = "";

        // Создание временного массива строк
        String[] numString = null;

        // Обработка строк в цикле while
        // чтение, проверка и отправка строк в новый документ
        while (scanner.hasNextLine()) {

            // Обработка строк из документа shoes.csv
            line = scanner.nextLine();
            numString = line.split(";");

            // проверка: есть ли "0" в конце строки
            // и отправка нужной строки в документ missing_shoes.txt
            if (numString[2].equals("0")) {
                printWriter.println(line.replace(";",", "));
            }

        } // Закрытие цикла while

        // Закрытие потока Scanner
        scanner.close();

        // Закрытие потока PrintWriter
        printWriter.close();

    }

}
