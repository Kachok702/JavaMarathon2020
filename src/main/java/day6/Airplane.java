package day6;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

   public void info() {
        System.out.println("Изготовитель: " + producer + " ,год выпуска: " + year + ", длина: " + length + ", вес: "
                + weight + ", количество топлива в баке: " + getFuel());
    }

    public void fillUp(double litr) {
                fuel += litr;


    }
}
