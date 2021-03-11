package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        // Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 350; i++) {
            if (i > 31 && i < 300)
                continue;
             else if (i % 2 == 0)
                numbers.add(i);
        }

        //Вывести список.
        System.out.println(numbers);


    }
}
