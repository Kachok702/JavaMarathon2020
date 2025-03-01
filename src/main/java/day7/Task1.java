package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("USSR", 2017, 15.4, 25.4);
        Airplane deltaplane = new Airplane("Canada", 2025, 20, 14.4);
         Airplane.compareAirplanes(airplane1, deltaplane);
    }
}