package be.intecbrussel;

public class Product {

    private final double amount;
    public final double minimumExpense = 5000;
    public double discount;

    public Product(double amount) {
        this.amount = amount;
    }

    public double getTotalAmount() {
        double result = amount;
        double discountPercentage = 0.05;
        this.discount = amount * discountPercentage;

        if (this.amount >= this.minimumExpense) {
            result -= discount;
        }
        return result;
    }



/**/
    // Toon het uiteindelijke resultaat
}
