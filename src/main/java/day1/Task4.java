package day1;

public class Task4 {
    public static void main(String[] args) {
        int year = 1980;
        int count = year;
        while (count <= 2020) {
            System.out.println("Олимпиада " + count + " года");
            count +=4;
        }
    }
}
