package day9.Task2;

public class Rectangle extends Figure {
    private double width, hight;

    public Rectangle(double width, double hight, String color) {
        super(color);
        this.hight = hight;
        this.width = width;
    }

    @Override
    public double area() {
        double rectangleArea = this.width * this.hight;
        return rectangleArea;
    }

    @Override
    public double perimeter() {
        double rectanglePerimeter = (this.width + this.hight) * 2;
        return rectanglePerimeter;
    }
}
