package Problem3;

import java.util.Scanner;

public class Validator {
    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        String input = sc.next();
        sc.nextLine();
        return input;
    }

    public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Invalid integer input.");
                sc.next(); // clear invalid input
            }
            sc.nextLine();
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(sc, prompt);
            if (i < min) {
                System.out.println("Error: Must be >= " + min);
            } else if (i > max) {
                System.out.println("Error: Must be <= " + max);
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public static double getDouble(Scanner sc, String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Invalid decimal number.");
                sc.next(); // clear invalid input
            }
            sc.nextLine();
        }
        return d;
    }

    public static double getDouble(Scanner sc, String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(sc, prompt);
            if (d < min) {
                System.out.println("Error: Must be >= " + min);
            } else if (d > max) {
                System.out.println("Error: Must be <= " + max);
            } else {
                isValid = true;
            }
        }
        return d;
    }
}
