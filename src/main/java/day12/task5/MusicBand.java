package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    //Поля
    private final String name;
    private final int year;
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
        if (musicians.size() >0) {
            for (MusicArtist m :
                    musicians) {
                namesOfMusicians += ", " + m.printName();
            }
        namesOfMusicians = namesOfMusicians.substring(2) + ".";
        }
        else
            namesOfMusicians = "список пуст.";
        System.out.printf("Группа \"%s\". Музыканты: %s\n", name, namesOfMusicians);
    }

    //Добавить всех  участников
    public void addAllMambers(MusicBand otherBand) {
        musicians.addAll(otherBand.getMusicians());
    }

    //Очистить список участников
    public void clearAllMambers() {
        musicians.clear();
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
