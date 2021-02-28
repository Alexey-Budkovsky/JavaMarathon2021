package day6;

public class Motorbike {
    private String model;
    private String color;
    private int yearOfProduction;

    //    Конструктор класса
    public Motorbike(String model, String color, int yearOfProduction) {
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    //    Геттеры
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    void info() {
        System.out.println("Это мотоцикл");
    }

    int yearDifference(int inputYear) {
        inputYear -= yearOfProduction;
        if (inputYear < 0) inputYear *= -1;
        return inputYear;
    }


}
