package day6;

import java.util.Scanner;

public class Motorbike {
    private int yearBorn;
    private String color;
    private String model;

    Motorbike(int yearBorn, String color, String model) {
        this.yearBorn = yearBorn;
        this.color = color;
        this.model = model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int yearDifference){
        return Math.abs(yearBorn - yearDifference);
    }

    void getYearBorn() {
        System.out.println(yearBorn);
    }

    void getColor() {
        System.out.println(color);
    }

    void getModel() {
        System.out.println(model);
    }


}
