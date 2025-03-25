package Problem3;

import java.util.Scanner;

public class LineItemapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Line Item Application!");

        String code = Validator.getString(sc, "Enter product code: ");
        Product product = ProductDB.getProduct(code);

        int quantity = Validator.getInt(sc, "Enter quantity: ", 1, 100);

        LineItem item = new LineItem();
        item.setProduct(product);
        item.setQuantity(quantity);

        System.out.println("\nPRODUCT DETAILS:");
        System.out.println("Code       : " + product.getCode());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price      : " + product.getFormattedPrice());
        System.out.println("Quantity   : " + item.getQuantity());
        System.out.println("Total      : " + item.getFormattedTotal());

        sc.close();
    }
}
