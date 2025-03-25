package problem_2B;

public class Cricle extends Shape {

    private double radius = 1.0;

    public Cricle() {

    }

    public Cricle(double radius) {
        this.radius = radius;

    }

    public Cricle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ",radius:" + radius + "]";
    }

}
