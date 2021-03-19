package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file2 = new File("people");
        System.out.println(parseFileToStringList(file2));

    }
// Статический метод
    public static List<String> parseFileToStringList(File file) {

//Поверка на исключение FileNotFoundException
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        }

//Создание списка List<String> и массива int для проверки чисел
        List<String> strPeople = new ArrayList<>();
        String line = "";
        String[] numString = null;

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            strPeople.add(line);
            numString = line.split(" ");
        }

//Закрытие потока
        scanner.close();

//Проверка на отрицательный возраст
        for (int i = 1; i < numString.length; i += 2) {
            if (Integer.parseInt(numString[i]) < 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Некорректный входной файл");
                }
                return null;
            }
        }

//Возвращаемый список
        return strPeople;

    }
}
