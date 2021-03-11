package day12.task3;

public class MusicBand {
    //Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
    private String name;
    private int year;

    //Конструктор
    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    //Геттеры
    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    //toString
    @Override
    public String toString() {
        return "{\'" + name + '\'' +
                ", " + year +
                "}";
    }
}
