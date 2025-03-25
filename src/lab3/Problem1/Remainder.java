package Problem1;

public class Remainder {
    private int Min;
    private int Max;

    public Remainder(int Min, int Max) {
        this.Max = Max;
        this.Min = Min;

    }

    public void checkPrimary() {
        int count = 0;

        for (int i = Min; i < Max; i++) {

            if (i % 3 == 1 && i % 4 == 2 && i % 5 == 3 && i % 6 == 4) {
                count++;

            }

        }

        System.out.println(count);

    }

}
