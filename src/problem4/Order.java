package problem4;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items;
    private int id;

    public Order(int id) {
        this.id = id;
        this.items = new ArrayList<>();
    }

    public double calculateAverageCost() {
        if (items.isEmpty()) {
            return 0;

        }
        double total = 0;
        for (Item item : items) {

            total += item.getPrice();

        }
        return total / items.size();

    }

    public int numberItems() {

        return items.size();
    }

    public void addItems(Item item) {
        items.add(item);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
