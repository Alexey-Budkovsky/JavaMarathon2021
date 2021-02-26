package day5;

public class Task1 {
    public static void main(String[] args) {
        Car auto = new Car();
        auto.setModel("land Rover Defender");
        auto.setYearOfProduction(2021);
        auto.setColor("Fuji White");

        System.out.println("Модель автомобиля: " + auto.getModel());
        System.out.println("Цвет: " + auto.getColor());
        System.out.println("Год выпуска: " + auto.getYearOfProduction());

    }
}
