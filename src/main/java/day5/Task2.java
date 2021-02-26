package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike("Harley-Davidson Livewire","orange", 2021);

        System.out.println("Модель мотоцикла: " + moto.getModel());
        System.out.println("Цвет мотоцикла: " + moto.getColor());
        System.out.println("Год производства мотоцикла: " + moto.getYearOfProduction());

    }
}
