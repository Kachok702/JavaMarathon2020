package day6;

public class Task1 {
    public static void main(String[] args) {
Motorbike moto = new Motorbike(2017, "Black", "Yakhoma");
    moto.info();
    Car car = new Car();
    car.setColor("White");
    car.setModel("Ldaa");
    car.setYearBorn(2020);
    car.info();
    System.out.println(moto.yearDifference(2025));
    System.out.println(car.yearDifference(2025));
    }

}
