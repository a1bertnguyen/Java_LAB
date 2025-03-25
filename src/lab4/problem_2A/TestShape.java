package problem_2A;

public class TestShape {
    public static void main(String[] args) {
        // Test Shape
        Shape s1 = new Shape();
        Shape s2 = new Shape("blue", false);
        System.out.println(s1);

        System.out.println(s2);

        // Test Circle
        Cricle c1 = new Cricle();
        Cricle c2 = new Cricle(2.5, "yellow", true);
        System.out.println(c1);

        System.out.println("Area: " + c2.getArea());

        System.out.println("Perimeter: " + c2.getPerimeter());

        System.out.println(c2);

        // Test Rectangle
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle("red", false, 2.0, 2.0);
        System.out.println(r1);

        System.out.println("Area: " + r2.getArea());

        System.out.println("Perimeter: " + r2.getPerimeter());

        System.out.println(r2);

        // Test Square
        Square sq1 = new Square();
        Square sq2 = new Square(3.0, "purple", true);
        System.out.println(sq1);

        System.out.println("Area: " + sq2.getArea());

        System.out.println("Perimeter: " + sq2.getPerimeter());

        System.out.println(sq2);
    }
}
