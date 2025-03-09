package problem5;

import java.util.Scanner;

public class BigSmallGame {
    private static final int PLAYER_WALLET_START = 100;
    private static final int HOUSE_WALLET_START = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player player = new Player(PLAYER_WALLET_START);
        House house = new House(HOUSE_WALLET_START);
        int couter = 1;

        while (true) {

            System.out.println("Round " + couter);
            System.out.println("\nYour wallet: $" + player.getWallet());
            System.out.println("House wallet: $" + house.getWallet());
            System.out.println("Try your luck to win all the money of the house");

            System.out.println("How much do you want to bet: ");

            int bet = scanner.nextInt();
            if (bet > player.getWallet()) {
                System.out.println("You don't have enough money!");
                continue;
            }
            System.out.print("Choose 'big' or 'small': ");
            String choice = scanner.next();

            player.setBet(bet);
            player.setChoice(choice);

            house.rollDice();
            house.printDice();
            int sum = house.sumDices();
            String result = house.checkDiceResult();
            System.out.println("Sum of dices: " + sum);
            System.out.println("Result: " + result);

            Dice[] dices = house.getDices();
            boolean allSame = dices[0].getValue() == dices[1].getValue() &&
                    dices[1].getValue() == dices[2].getValue();
            if (allSame) {
                System.out.println(" All dice have the same value. You lose automatically!");
                player.addWallet(-bet);
                house.addWallet(bet);
            } else {
                if ((result.equals("small") && player.getChoice().equalsIgnoreCase("big")) ||
                        (result.equals("big") && player.getChoice().equalsIgnoreCase("small"))) {
                    System.out.println(" You win! +$" + bet);
                    player.addWallet(bet);
                    house.addWallet(-bet);

                } else {
                    System.out.println(" You lose! -$" + bet);
                    player.addWallet(-bet);
                    house.addWallet(bet);

                }
            }

            if (player.getWallet() <= 0) {
                System.out.println(" You are out of money! Game Over.");
                break;
            }

            if (house.getWallet() <= 0) {
                System.out.println(" The house is out of money! You win the game!");
                break;
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String continueGame = scanner.next();
            if (!continueGame.equalsIgnoreCase("yes")) {
                break;
            }
            couter++;
        }

        System.out.println("Game Over!");
        scanner.close();

    }

}
