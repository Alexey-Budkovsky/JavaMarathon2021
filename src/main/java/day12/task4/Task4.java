package day12.task4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
//Состав 1 группы
        MusicBand band1 = new MusicBand("Deep Purple", 1968, new ArrayList<>());
        List<String> staff = new ArrayList<>();
        staff.add("Ian Gillan");
        staff.add("Jon Lord");
        staff.add("Ritchie Blackmore");
        staff.add("Roger Glover");
        staff.add("Ian Paice");
        band1.setMambers(staff);
//Проверки
//        System.out.println(band1.getMambers());
//        System.out.println(band1);
//Состав 2 группы
        MusicBand band2 = new MusicBand("Black Sabbath", 1968);
        staff = Arrays.asList("Tony Iommi", "Ozzy Osbourne", "Terence \"Geezer\" Butler", "Bill Ward");
        List<String> crew = new ArrayList<>(staff);
        band2.setMambers(crew);
//Проверки
//        System.out.println(band2.getMambers());
//        System.out.println(band2);
//Слияние групп
        transferMembers(band1, band2);
//Проверки
        System.out.println();
        band1.printMambers();
        band2.printMambers();
//Повторное слияние групп
        transferMembers(band2, band1);
//Проверки
        System.out.println();
        band1.printMambers();
        band2.printMambers();
    }

    //Cтатический метод перестановки  групп :)
    static void permutationMembers(MusicBand bandFirst, MusicBand bandSecond) {
        MusicBand tempBand = new MusicBand();
        tempBand.setMambers(bandFirst.getMambers());
        bandFirst.setMambers(bandSecond.getMambers());
        bandSecond.setMambers(tempBand.getMambers());
    }

    //Cтатический метод слияния групп
    static void transferMembers(MusicBand bandFirst, MusicBand bandSecond) {
        bandFirst.addAllMambers(bandSecond);
        bandSecond.clearAllMambers();
    }


}
