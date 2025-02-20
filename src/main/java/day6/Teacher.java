package day6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Teacher {
    private String name;
    private String predmet;

    public Teacher(String name, String predmet) {
        this.name = name;
        this.predmet = predmet;
    }

    public void evalute(Student student) {
        Random random = new Random();
        int ball = random.nextInt(4) + 2;

        String ocenka = "";
                switch (ball) {
            case 2:
               ocenka = "неудовлетворительно";
                break;
            case 3:
                ocenka = "удовлетворительно";
                break;
            case 4:
                ocenka = "хорошо";
                break;
            case 5:
                ocenka = "отлично";
                break;
        }
        System.out.println("Преподователь " + this.name + " оценил студента с именем " + student.getNameStudent() + " по предмету " + this.predmet + " на оценку " + ocenka + ".");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }
}
