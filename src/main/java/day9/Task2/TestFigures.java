package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

//Проверки
//        System.out.println(figures[0].perimeter());
//        System.out.println(figures[2].perimeter());
//        System.out.println(figures[3].perimeter());
//        System.out.println(figures[0].area());

//Резултаты
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }

//Методы
    public static double calculateRedPerimeter(Figure[] figures) {
        double redColorPerimeterSum = 0;
        for (Figure i : figures) {
            if (i.getColor("Red").equals("Red")) redColorPerimeterSum += i.perimeter();
        }
        return redColorPerimeterSum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double redColorAreaSum = 0;
        for (Figure i : figures) {
            if (i.getColor("Red").equals("Red")) redColorAreaSum += i.area();
        }
        return redColorAreaSum;
    }

}
