package day6;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel = 0;

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
        System.out.println("Изготовитель: " + producer + ", " + "год выпуска: " + year + ";" + " длина: " + length + " м;" + " вес: " + weight + " кг;" + " количество топлива в баке: " + fuel + " л.");
    }

    int fillUp(int n) {
        fuel += n;
        return fuel;
    }
}
