package problem3;

import java.util.Scanner;

public class DistanceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the frist point x and y");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Enter the second point x and y ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        System.out.println("The distance between X and Y is: ");
        System.out.println(point1.distance(point2));
        scanner.close();

    }

}
