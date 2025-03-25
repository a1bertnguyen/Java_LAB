package problem5;

import java.util.Random;

public class Dice {
    private int value;

    public Dice() {
        roll();
    }

    public void roll() {
        Random rand = new Random();
        this.value = rand.nextInt(6) + 1;
    }

    public int getValue() {
        return value;
    }
}
