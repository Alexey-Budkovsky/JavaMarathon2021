package day6;


public class Task1 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike("Harley-Davidson Livewire", "orange", 2021);
        moto.info();
        System.out.println("Разница между годом выпуска и веденным годом: " + moto.yearDifference(1905));

        Car car = new Car();
        car.setModel("land Rover Defender");
        car.setYearOfProduction(2021);
        car.setColor("Fuji White");
        car.info();
        System.out.println("Разница между годом выпуска и веденным годом: " + moto.yearDifference(2021));

    }
}
