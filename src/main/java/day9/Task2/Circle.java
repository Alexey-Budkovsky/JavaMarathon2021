package day9.Task2;

public class Circle extends Figure {

    private double circleRadius;

    public Circle(double circleRadius,String color) {
        super(color);
        this.circleRadius = circleRadius;
    }

    @Override
    public double area() {
        double circleArea = Math.pow(circleRadius, 2) * Math.PI;
        return circleArea;
    }

    @Override
    public double perimeter() {

        double circlePerimeter = 2 * this.circleRadius * Math.PI;
        return circlePerimeter;
    }
}
