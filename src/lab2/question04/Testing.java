package question04;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Box box = Box.getInstance();
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number of particles inside the box:");
        int n = scn.nextInt();
        scn.nextLine();
        box.createParticle(n);
        box.display();

        System.out.println("Enter a number of steps wanting: ");
        int k = scn.nextInt();
        scn.nextLine();
        for (int i = 1; i <= k; i++) {
            System.out.println("----At step " + i + "---");
            box.updateParticle();
            box.display();
        }

    }
}
