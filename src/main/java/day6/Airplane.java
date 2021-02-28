package day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

// Конструктор

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    // Сеттеры
    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    // Геттеры
    public int getFuel() {
        return fuel;
    }

    // Методы
    void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d; длина: %d м; вес: %d кг; количество топлива в баке: %d л.\n", producer, year, length, weight, fuel);
    }

    public void fillUp(int n) {
        fuel += n;
    }
}
