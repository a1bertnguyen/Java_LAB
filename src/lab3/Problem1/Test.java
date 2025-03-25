package Problem1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Min = scanner.nextInt();
        int Max = scanner.nextInt();

        Remainder remainder = new Remainder(Min, Max);

        remainder.checkPrimary();

    }

}
