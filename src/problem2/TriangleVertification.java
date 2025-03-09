package problem2;

import java.util.Scanner;;

public class TriangleVertification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers for the sidess of the triangle");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        Triangle triangle = new Triangle(x, y, z);
        triangle.verify();
        System.out.println(triangle.verify());
        scanner.close();

    }

}
