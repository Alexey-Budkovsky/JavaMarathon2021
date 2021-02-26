package day5;

public class Car {
    private String model;
    private String color;
    private int yearOfProduction;

    //    Сеттеры
    public void setModel(String mod) {
        if (mod.isBlank()) {
            System.out.println("Не введена модель автомобиля");
        } else
            model = mod;
    }

    public void setColor(String carColor) {
        if (carColor.isBlank()) {
            System.out.println("Не введен цввет автомобиля");
        } else
            color = carColor;
    }

    public void setYearOfProduction(int carYear) {
        if (carYear < 2021) {
            System.out.println("Подержанный автомобиль");
        } else
            yearOfProduction = carYear;
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

}
