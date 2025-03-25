package problem1;

import java.util.Scanner;

public class testRectangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height");
        int  height = scanner.nextInt();

        System.out.println("Enter width");
         int width = scanner.nextInt();
        Rectangle rectangle =new Rectangle(height, width);
        rectangle.visualize(height,width);
        scanner.close();

       
    }

}
