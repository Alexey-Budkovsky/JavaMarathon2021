package day9.Task1;

public class Human {
    private String name;

    // Конструктор
    public Human(String name) {
        this.name = name;
    }

    // Геттер
    public String getName() {
        return name;
    }

    // Методы
    public void printInfo() {
        System.out.println("Этот человек с именем " + getName());
    }
}
