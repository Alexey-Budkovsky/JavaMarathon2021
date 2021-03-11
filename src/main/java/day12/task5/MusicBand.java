package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    //Поля
    private String name;
    private int year;
    private List<MusicArtist> musicians;

    //Конструкторы
    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        this.musicians = new ArrayList<>();
    }

    //Геттеры
    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public List<MusicArtist> getMusicians() {
        return musicians;
    }

    //Сеттеры
    public void setMusicians(List<MusicArtist> musicians) {
        this.musicians = musicians;
    }

    //Методы
    public void printMusicians() {
        String namesOfMusicians = "";
        for (MusicArtist m:
             musicians) {
            namesOfMusicians += m.printName();
        }
        namesOfMusicians = namesOfMusicians.substring(0, namesOfMusicians.length() - 2) + ".";
        System.out.printf("Группа \"%s\". Музыканты: %s\n", name, namesOfMusicians);
    }

    //toString
    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", musicians=" + musicians +
                '}';
    }

}
