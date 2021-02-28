package day6;

public class Car {
    private String model;
    private String color;
    private int yearOfProduction;

    //Сеттеры
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    //Геттеры
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
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear) {
        return inputYear = Math.abs(inputYear);
    }
}
