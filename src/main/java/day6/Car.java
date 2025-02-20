package day6;

import java.util.Scanner;

public class Car {

  private int yearBorn;
    private String color;
   private String model;
    int yearDifference;

    public void info(){
        System.out.println("Это Автомобиль");

    }

    public int yearDifference(int yearDifference){
                return Math.abs(yearBorn - yearDifference);
            }

    void getYearBorn() {
        System.out.println(yearBorn);
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public String getColor() {

        return color;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
               return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
