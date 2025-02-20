package day6;

import java.util.Scanner;

public class Airplane {
    private String producer;
    private int year;
    private int lenght;
    private int weight;
    private int fuel;


    public Airplane(String producer, int year, int lenght, int weight) {
        this.producer = producer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска " + year +
                " г., длина: " + lenght + " м., вес: " + weight + "т., количество топлива в баке: " + fuel + " л");
    }

    public int getFuel() {
        return fuel;
    }

    public void fiiUp() {
        System.out.print("Введите объем в литрах на сколько хотите заправить самолет: ");
        Scanner scanner = new Scanner(System.in);

        int varLitr = scanner.nextInt();
        fuel += varLitr;

        System.out.println("Вы заправили самолет на: " + fuel + " л");
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
