package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane Boeing747 = new Airplane("Boeing", 2010, 70, 183000);
        Airplane Airbus380 = new Airplane("Airbus", 2011, 67, 350000);
        Airplane.compareAirplanes(Boeing747, Airbus380);
    }
}