package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Александр Александрович","Java Android");
        Teacher teacher = new Teacher("Петр Петрович","Java language");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();


    }
}
