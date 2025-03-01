package day9.Task2;

public class Triangle extends Figure{
    private double a1;
    private double a2;
    private double a3;

    public Triangle(double a1, double a2, double a3, String color) {
        super(color);
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    @Override
    public double area() {
        double y = (a1 + a2 + a3)/2;
              double x = Math.sqrt(y * (y - a1) * (y - a2) *(y - a3));
        return x;
    }

    @Override
    public double perimeter() {
        return (a1 + a2 + a3);
    }
}
