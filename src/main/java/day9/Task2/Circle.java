package day9.Task2;

public class Circle extends Figure{
   private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        final double pi;
        pi = Math.PI;
        return pi * (Math.pow(radius, 2));
    }

    @Override
    public double perimeter() {
        final double pi;
        pi = Math.PI;
        return (pi * 2 *  radius);
    }
}
