package problem5;

public class House {
    private static final byte MIN_SMALL = 4;
    private static final byte MAX_SMALL = 10;
    private static final byte MIN_BIG = 11;
    private static final byte MAX_BIG = 17;
    private int wallet;
    Dice[] dices;

    public House(int wallet) {
        this.wallet = wallet;
        this.dices = new Dice[3];
        for (int i = 0; i < 3; i++) {
            dices[i] = new Dice();
        }

    }

    public void rollDice() {
        for (Dice dice : dices) {
            dice.roll();
        }
    }

    public void printDice() {
        for (Dice dice : dices) {
            System.out.println(dice.getValue() + " ");
        }
        System.out.println();
    }

    public int sumDices() {
        int sum = 0;
        for (Dice dice : dices) {
            sum += dice.getValue();
        }
        return sum;
    }

    public Dice[] getDices() {
        return dices;
    }

    public String checkDiceResult() {
        int sum = sumDices();
        if (sum >= MIN_SMALL && sum <= MAX_SMALL) {
            return "small";
        } else if (sum >= MIN_BIG && sum <= MAX_BIG) {
            return "big";
        } else {
            return "same";
        }
    }

    public int getWallet() {
        return wallet;
    }

    public void addWallet(int amount) {
        wallet += amount;
    }

}
