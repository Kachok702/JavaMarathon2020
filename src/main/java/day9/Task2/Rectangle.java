package day9.Task2;

public class Rectangle extends Figure{
    private double shirina;
    private double vusota;

    public Rectangle(double shirina, double vusota, String color) {
        super(color);
        this.shirina = shirina;
        this.vusota = vusota;
    }

    @Override
    public double area() {
        return shirina * vusota;
    }

    @Override
    public double perimeter() {
        return ((shirina + vusota) * 2);
    }
}
