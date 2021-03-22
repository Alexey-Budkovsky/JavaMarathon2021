package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static final int COUNTER_1000 = 1000;
    public static final int COUNTER_100 = 100;
    public static final int COUNTER_20 = 20;

    public static void main(String[] args) throws FileNotFoundException {

        String address1 = "file1.txt";
        String address2 = "file2.txt";
        createTwoFiles(address1, address2);
        File fileAddress2 = new File(address2);
        printResult(fileAddress2);


    }

    public static void createTwoFiles(String string1, String string2) throws FileNotFoundException {
        // Создание и наполнение первого документа случайными числами
        File fileString1 = new File(string1);
        PrintWriter pwFile1 = new PrintWriter(fileString1);
        int sum = 0;
        for (int i = 0; i < COUNTER_1000; i++) {
            sum = (int) (Math.random() * (COUNTER_100 + 1));
            pwFile1.print(sum);
            pwFile1.print(" ");
        }
        // Закрытие потока PrintWriter
        pwFile1.close();

        // Создание и наполнение второго документа
        // для каждой группы из 20 целых чисел из файла fileInput  рассчитывается их среднее арифметическое
        File fileString2 = new File(string2);
        Scanner scanner = new Scanner(fileString1);
        PrintWriter pwFile2 = new PrintWriter(fileString2);
        double tempNum = 0;
        int index = 0;
        sum = 0;
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.next();
            if (index < COUNTER_20) {
                sum += Integer.parseInt(line);
                index++;
            } else {
                tempNum = (double) sum / index;
                pwFile2.print(index + " ");
                pwFile2.print(tempNum + " ");
                index = 0;
            }

        }
        // Закрытие потока Scanner
        scanner.close();
        // Закрытие потока PrintWriter
        pwFile2.close();
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = "";
        double sum = 0.0;
        while (scanner.hasNext()) {
            line = scanner.next();
            sum += Double.parseDouble(line);
        }
        System.out.println((int) sum);

    }


}
