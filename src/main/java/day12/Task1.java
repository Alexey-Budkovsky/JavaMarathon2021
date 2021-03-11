package day12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        //Создать список строк, добавить в него 5 марок автомобилей,
        //вывести список в консоль.
        List<String> cars = new ArrayList<>();
        cars.add("Jaguar");
        cars.add("Alfa Romeo");
        cars.add("Suzuki");
        cars.add("Porsche");
        cars.add("Mitsubishi");

        System.out.println(cars);

        //Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка.
        //Вывести список в консоль.
        cars.add(3, "Jeep");

        System.out.println(cars);

        cars.remove(0);

        System.out.println(cars);


    }
}
