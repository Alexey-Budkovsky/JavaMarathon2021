package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Александр Александрович", "Информатика");
        Student student = new Student("Андрей Андреевич");
        teacher.evaluate(student);

    }
}
