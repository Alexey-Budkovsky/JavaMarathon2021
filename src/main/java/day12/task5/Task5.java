package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
//Состав 1 группы
        MusicBand band1 = new MusicBand("Deep Purple", 1968);
        List<MusicArtist> deepPurple = new ArrayList<>();
        deepPurple.add(new MusicArtist("Ian Gillan", 1945));
        deepPurple.add(new MusicArtist("Jon Lord", 1941));
        deepPurple.add(new MusicArtist("Ritchie Blackmore", 1945));
        deepPurple.add(new MusicArtist("Roger Glover", 1945));
        deepPurple.add(new MusicArtist("Ian Paice", 1948));
//Назначаем музыкантов группе 1
        band1.setMusicians(deepPurple);
//Проверка
//        System.out.println(band1);
//Состав 2 группы
        MusicBand band2 = new MusicBand("Black Sabbath", 1968);
        List<MusicArtist> blackSabbath = new ArrayList<>();
        blackSabbath.add(new MusicArtist("Tony Iommi", 1948));
        blackSabbath.add(new MusicArtist("Ozzy Osbourne", 1948));
        blackSabbath.add(new MusicArtist("Terence \"Geezer\" Butler", 1949));
        blackSabbath.add(new MusicArtist("Bill Ward", 1948));
//Назначаем музыкантов группе 2
        band2.setMusicians(blackSabbath);
//Проверка
//        System.out.println(band2);
//Перестановка
        transferMembers(band1, band2);
//Проверки
        band1.printMusicians();
        band2.printMusicians();


    }

    //Cтатический метод слияния групп
    static void transferMembers(MusicBand bandFirst, MusicBand bandSecond) {
        MusicBand tempBand = new MusicBand("", 0);
        tempBand.setMusicians(bandFirst.getMusicians());
        bandFirst.setMusicians(bandSecond.getMusicians());
        bandSecond.setMusicians(tempBand.getMusicians());
    }


}
