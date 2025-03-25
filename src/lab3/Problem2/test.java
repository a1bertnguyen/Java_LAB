package Problem2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 6 values for 3 vertices");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);
        Point2D p3 = new Point2D(x3, y3);
        Triangle triangle = new Triangle(p1, p2, p3);
        System.out.println("Triangle Type: " + triangle.getTypeName());

    }

}
