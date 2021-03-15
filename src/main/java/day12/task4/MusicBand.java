package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    //Поля
    private String name;
    private int year;
    private List<String> mambers;

    //Конструкторы
    public MusicBand(String name, int year, List<String> mambers) {
        this.name = name;
        this.year = year;
        this.mambers = mambers;
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public MusicBand() {
        this.mambers = new ArrayList<>();
    }

    //Геттеры
    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public List<String> getMambers() {
        return mambers;
    }

    //Сеттеры
    public void setMambers(List<String> mambers) {
        this.mambers = mambers;
    }

    //Методы
    //Список участников
    public void printMambers() {
        System.out.printf("Группа \"%s\". Музыканты: %s\n", name, mambers);
    }
    //Добавить всех  участников
    public void addAllMambers(MusicBand otherBand) {
        mambers.addAll(otherBand.getMambers());
    }
    //Очистить список участников
    public void clearAllMambers(){
        mambers.clear();
    }


    //toString
    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", mambers=" + mambers +
                '}';
    }


}
