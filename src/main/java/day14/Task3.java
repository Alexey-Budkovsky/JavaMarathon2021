package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file3 = new File("people");
        System.out.println(parseFileToObjList(file3));

    }

    // Статический метод
    public static List<Person> parseFileToObjList(File file) {

// Поверка на исключение FileNotFoundException
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        }

        List<Person> people = new ArrayList<>(); // Пустой список объектов Person

// Геннерация списка объектов Person
// Генерация массива строк для заполнения полей объектов Person
        while (scanner.hasNextLine()) {
            // Создание временной строки
            String line = "";
            line = scanner.nextLine();

            // Создание временного массива строк
            String[] numString = null;
            numString = line.split(" ");

            // Создание временного объекта Person
            Person tempPerson = new Person();
            // Заполнение поля name текущего объекта Person из массива строк numString
            tempPerson.setName(numString[0]);
            // Заполнение поля age текущего объекта Person из массива строк numString
            tempPerson.setAge(Integer.parseInt(numString[1]));
            // Добавление текущего объекта Person в список List<Person> people
            people.add(tempPerson);

            // Проверка на отрицательный возраст
            if (tempPerson.getAge() < 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Некорректный входной файл");
                }
                return null;
            }
        }

//Закрытие потока
        scanner.close();

// Возвращение спика объектов Person
        return people;
    }

}
