package day12.task5;

public class MusicArtist {
    //Поля
    public static final int THIS_YEAR = 2021;
    private String name;
    private int yearOfBirth;

    //Конструкторы
    public MusicArtist(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    //Методы
    public String printName() {
        String isName = name + ", ";
        return isName;
    }


    //Вычисляем возраст
    public int age() {
        int personAge = THIS_YEAR - yearOfBirth;
        return personAge;
    }

    //toString
    @Override
    public String toString() {
        return "MusicArtist{" +
                "name='" + name + '\'' +
                ", age=" + age() + //Вычисляем возраст
                '}';
    }
}
