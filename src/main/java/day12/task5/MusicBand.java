package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    //Поля
    private final String name;
    private final int year;
    private List<MusicArtist> mambers;

    //Конструкторы
    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        this.mambers = new ArrayList<>();
    }

    //Геттеры
    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public List<MusicArtist> getMambers() {
        return mambers;
    }

    //Сеттеры
    public void setMambers(List<MusicArtist> musicians) {
        this.mambers = musicians;
    }

    //Методы
    public void printMusicians() {
        String namesOfMambers = "";
        if (mambers.size() > 0) {
            for (MusicArtist m :
                    mambers) {
                namesOfMambers += ", " + m.printName();
            }
            namesOfMambers = namesOfMambers.substring(2) + ".";
        } else
            namesOfMambers = "список пуст.";
        System.out.printf("Группа \"%s\". Музыканты: %s\n", name, namesOfMambers);
    }

    //Добавить всех  участников
    public void addAllMambers(MusicBand otherBand) {
        mambers.addAll(otherBand.getMambers());
    }

    //Очистить список участников
    public void clearAllMambers() {
        mambers.clear();
    }


    //toString
    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", musicians=" + mambers +
                '}';
    }

}
