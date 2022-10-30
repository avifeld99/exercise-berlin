package be.intecbrussel;

public class Product {

    private double amount;
    private final double discountPercentage = 0.05;
    public final double minimumExpense = 5000;

    public double discount;

    public Product(double amount) {
        this.amount = amount;
    }

    public double getTotalAmount() {
        double result = amount;
        this.discount = amount * discountPercentage;

        if (this.amount >= this.minimumExpense) {
            result -= discount;
        }
        return result;
    }



/**/
    // Toon het uiteindelijke resultaat
}
