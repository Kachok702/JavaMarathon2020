package day6;

public class Task2 {
    public static void main(String[] args) {
Airplane airplane = new Airplane("USSR", 1991, 17.4, 32.5);
airplane.setYear(1990);
airplane.setLength(14);
airplane.fillUp(2.1);
airplane.fillUp(14);
airplane.info();

    }
}
