package day9.Task2;

public abstract class Figure {
    private String color;

    // Конструктор
    public Figure(String color) {
        this.color = color;
    }

    // Геттер
    public String getColor(String red) {
        return color;
    }

    // Методы
    public abstract double area();
    public abstract double perimeter();
}
