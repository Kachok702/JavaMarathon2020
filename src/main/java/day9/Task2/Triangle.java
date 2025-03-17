package day9.Task2;

public class Triangle extends Figure{
    private double a, b, c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = this.a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double y = (a + b + c) / 2;
              double x = Math.sqrt(y * (y - a) * (y - b) *(y - c));
        return x;
    }

    @Override
    public double perimeter() {
        return (a + b + c);
    }
}
