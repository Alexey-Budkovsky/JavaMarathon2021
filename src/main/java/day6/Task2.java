package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2010, 70, 183000);
        airplane.setYear(2018);
        airplane.setLength(69);
        airplane.fillUp(100000);
        airplane.fillUp(75000);
        airplane.info();

    }
}
