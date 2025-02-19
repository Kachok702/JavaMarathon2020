package day5;

public class Car {

  private int yearBorn;
    private String color;
   private String model;



    public void getCharacher(){
        System.out.println("Ваш автомобиль: " + getModel() + " его цвет: " + getColor() + " " + getYearBorn() + " года выпуска");
    }

    public int getYearBorn() {

        return yearBorn;

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
