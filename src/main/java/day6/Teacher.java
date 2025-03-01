package day6;

import java.util.Random;

import static java.lang.Math.random;

public class Teacher {
    private String nameTeacher;
    private String subject;

    public Teacher(String nameTeacher, String subject) {
        this.nameTeacher = nameTeacher;
        this.subject = subject;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evalute(Student student) {
                int ball = 2 + (int) (Math.random() * 4);
                String point;
                switch (ball) {
                    case 2:
                        point = "неудовлеторительно";
                        break;
                    case 3:
                        point = "удовлеторительно";
                        break;
                    case 4:
                        point = "хорошо";
                        break;
                    case 5:
                        point = "отлично";
                        break;
                    default:
                        point = "Ошибка рандома";
                }

        System.out.println("Преподаватель " + getNameTeacher() + " оценил студента с именем " + student.getNameStudent() +
                " по предмету " + getSubject() + " на оценку " + point + ".");

    }
}
