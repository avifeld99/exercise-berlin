package be.intecbrussel;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        // Lees een bedrag in van een factuur
        Scanner myScan = new Scanner(System.in);
        double amount = myScan.nextDouble();

        Product product = new Product(amount);

        double result = product.getTotalAmount();

        if (result > product.minimumExpense) {
            System.out.println("the original price was: " + amount + " ,and after discount it's: " + result +
                    " ,total discount: " + product.discount);
        } else {
            System.out.println("total price: " + amount);
        }

        // Indien het bedrag groter is dan 5000 euro, dan wordt er een korting van 5 % toegestaan


    }
}