package problem4;

import java.util.Scanner;;

public class Ordertest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new number ID for order: ");

        int Orderid = scanner.nextInt();
        Order order = new Order(Orderid);

        System.out.println("How many items in the order: ");
        int Ordercount = scanner.nextInt();
        for (int i = 1; i < Ordercount; i++) {
            System.out.print("Please enter the ID for item " + i + ": ");
            int itemID = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Please enter the name for item " + i + ": ");
            String itemName = scanner.nextLine();

            System.out.print("Please enter the price for item " + i + ": ");
            double itemPrice = scanner.nextDouble();

            order.addItems(new Item(itemID, itemName, itemPrice));
        }
        // Hiển thị thông tin đơn hàng (KHÔNG dùng `toString()`)
        System.out.println("\nYou have a new order with ID: " + order.getId());
        System.out.println("In the order, you have " + order.numberItems() + " items.");
        System.out.println("The average price in the order is: " + String.format("%.2f", order.calculateAverageCost()));

        scanner.close();

    }

}
