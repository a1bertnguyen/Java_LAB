package problem_3B;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public double resize(int percent) {
        return radius *= percent / 100.0;
    }

}
