package problem1;

public class Rectangle {
    private int height, width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;

    }
    public void visualize(int height, int width) {
        if (height < 0) {
            height = 1;
            System.out.println("Warring: Input height is negative");
        }
        if (width < 0) {
            width = 1;
            System.out.println("Warring: Input width is negative");
        } 
        else {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            }
        }

    }


