package problem2;

public class Triangle {
    private int x, y, z;

    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String verify() {

        if (x + y <= z || x + z <= y || y + z <= x) {
            return "Not Triangle";
        }
        if (x == y && y == z) {
            return "Equilateral Triangle";
        }
        if (x == y || x == z || y == z) {
            return "Isosceles Triangle";
        }
        return "Scalene Triangle";
    }

}
