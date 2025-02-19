package day5;

public class Motorbike {
    private int yearBorn;
    private String color;
    private String model;

    Motorbike(int yearBorn, String color, String model) {
        this.yearBorn = yearBorn;
        this.color = color;
        this.model = model;
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
