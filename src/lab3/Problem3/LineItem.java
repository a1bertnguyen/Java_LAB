package Problem3;

import java.text.NumberFormat;

public class LineItem {
    private Product product;
    private int quantity;
    private double total;

    public void setProduct(Product product) {
        this.product = product;
        calculateTotal();
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quality) {
        this.quantity = quality;
        calculateTotal();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;

    }

    private void calculateTotal() {

        if (product != null) {
            total = quantity * product.getPrice();
        } else {
            total = 0.0;
        }

    }

    public String getFormattedTotal() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(getTotal());
    }

}
