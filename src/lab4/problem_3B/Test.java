package problem_3B;

public class Test {
    public static void main(String[] args) {
        GeometricObject c = new Circle(3);
        ResizableCircle rz = new ResizableCircle(20);
        System.out.println(c);

        System.out.println(rz);
        rz.resize(50);
        System.out.println(rz);
    }

}
