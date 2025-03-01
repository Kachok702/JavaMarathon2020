package day7;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public double getLength() {
        return length;
    }

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

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        int x = (int) airplane1.getLength();
        int y = (int) airplane2.getLength();
        if (x > y) {
            System.out.println("Первый самолет длиннее");
        } else if (x < y) {
            System.out.println("Второй самолет длиннее");
        } else
            System.out.println("Длины самолетов равны");
    }
}
