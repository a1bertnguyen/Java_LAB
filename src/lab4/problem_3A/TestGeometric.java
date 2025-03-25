package problem_3A;

public class TestGeometric {
    public static void main(String[] args) {
        GeometricObject c = new Circle(5.0);
        GeometricObject r = new Rectangle(3.0, 4.0);

        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());

        System.out.println(r);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}
