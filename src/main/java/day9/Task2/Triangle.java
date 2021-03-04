package day9.Task2;

public class Triangle extends Figure {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter() / 2;
        double sub1 = (halfPerimeter - this.side1);
        double sub2 = (halfPerimeter - this.side2);
        double sub3 = (halfPerimeter - this.side3);
        double mult = halfPerimeter * sub1 * sub2 * sub3;
        double squareRoot = Math.sqrt(mult);
        return squareRoot;
    }

    @Override
    public double perimeter() {
        double trianglePerimeter = this.side1 + this.side2 + this.side3;
        return trianglePerimeter;
    }
}
