package Problem2;

public class Triangle {
    private Point2D p1;
    private Point2D p2;
    private Point2D p3;
    private int type;

    public Triangle(Point2D p1, Point2D p2, Point2D p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.type = calculatetype();

    }

    public int getType() {
        return type;
    }

    public String getTypeName() {
        switch (type) {
            case 0:
                return "Equilateral";
            case 1:
                return "Isosceles";
            case 2:
                return "Scalene";
            default:
                return "Unknown";
        }
    }

    public int calculatetype() {
        double x = p1.distance(p2);
        double y = p2.distance(p3);
        double z = p3.distance(p1);
        if (x + y <= z || x + z <= y || y + z <= x) {
            return 0;
        }
        if (x == y && y == z) {
            return 1;
        }
        if (x == y || x == z || y == z) {
            return 2;
        }
        return 3;
    }

    @Override
    public String toString() {
        return "Triangle with vertices: " + p1 + ", " + p2 + ", " + p3;
    }
}
