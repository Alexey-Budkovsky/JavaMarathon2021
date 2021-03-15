package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
//Создать 10 или более экземпляров класса MusicBand
        MusicBand band1 = new MusicBand("Порнофильмы", 2008);
        MusicBand band2 = new MusicBand("IC3PEAK", 2013);
        MusicBand band3 = new MusicBand("The Doors", 1965);
        MusicBand band4 = new MusicBand("Queen", 1965);
        MusicBand band5 = new MusicBand("The Jimi Hendrix Experience", 1966);
        MusicBand band6 = new MusicBand("Guns N’Roses", 1985);
        MusicBand band7 = new MusicBand("The Rolling Stones", 1962);
        MusicBand band8 = new MusicBand("Led Zeppelin", 1968);
        MusicBand band9 = new MusicBand("The Animals", 1962);
        MusicBand band10 = new MusicBand("The Beatles", 1960);
        MusicBand band11 = new MusicBand("Creedence Clearwater Revival", 1967);
        MusicBand band12 = new MusicBand("Alice in Chains", 1987);

//Добавить их в список
        List<MusicBand> bands = new ArrayList<>();
        Collections.addAll
                (bands, band1, band2, band3, band4, band5, band6, band7, band8, band9, band10, band11, band12);
//Проверка
//        System.out.println(bands);
//Перемешать список
        Collections.shuffle(bands);
//Проверка
//        System.out.println(bands);

// Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп.
// Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));

    }

    //Этот метод принимает список групп в качестве аргумента и возвращает новый список,
    //состоящий из групп, основанных после 2000 года.
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groups = new ArrayList<>();
        for (MusicBand b : bands) {
            if (b.getYear() > 2000)
                groups.add(b);
        }
        return groups;
    }

}
