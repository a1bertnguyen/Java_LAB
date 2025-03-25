package problem3;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double distance(Point target) {

        return Math.sqrt(Math.pow(target.x - this.x, 2) + Math.pow(target.y - this.y, 2));

    }

}
