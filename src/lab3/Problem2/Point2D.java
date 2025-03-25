package Problem2;

import java.util.Scanner;

public class Point2D {
    private double y; // y-coordinate
    private double x; // x-coordinate

    public Point2D() {
        this.x = 0;
        this.y = 0;

    }

    public Point2D(double x1, double y1) {
        this.x = x1;
        this.y = y1;

    }

    public Point2D(Point2D p) {
        this.x = p.x;
        this.y = p.y;

    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        this.x = scanner.nextInt();
        System.out.println("Enter y: ");
        this.y = scanner.nextInt();

    }

    public String toString() {

        return "(" + x + ", " + y + ")";

    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isOrigin() {
        return (this.x == 0 && this.y == 0);
    }

    public double distance(Point2D p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    public static double distance(Point2D p1, Point2D p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

}
