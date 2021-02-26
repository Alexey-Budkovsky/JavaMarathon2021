package day5;

public class Motorbike {
    private String model;
    private String color;
    private int yearOfProduction;

    //    Конструктор класса
    public Motorbike(String model, String color, int yearOfProduction) {
        System.out.println("\"I need your clothes, your boots and your motorcycle!\"\n");
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    //    Второй конструктор
    public Motorbike(String model) {
        this.model = model;
    }

    //    Третий конструктор
    public Motorbike() {
        this.model = "Harley-Davidson Sport Glide";
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
