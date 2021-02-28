package day6;

import java.util.Random;

public class Teacher {
    String name, subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    void evaluate(Student student) {
        Random rand = new Random();
        int evaluationNumber = rand.nextInt(6-2) + 2;
        String evaluationName = "";
        switch (evaluationNumber) {
            case 5:
                evaluationName = "отлично";
                break;
            case 4:
                evaluationName = "хорошо";
                break;
            case 3:
                evaluationName = "удовлетворительно";
                break;
            case 2:
                evaluationName = "неудовлетворительно";
                break;
        }
        System.out.printf("Преподаватель %s оценил студента по имени %s по предмету %s на оценку %s.\n", name, student, subject, evaluationName);
    }
}
