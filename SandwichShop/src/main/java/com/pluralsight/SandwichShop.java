package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get sandwich size
        System.out.println("Choose sandwich size (1 = Regular, 2 = Large): ");
        int size = input.nextInt();

        // Loaded?
        System.out.println("Would you like it loaded? (yes/no): ");
        input.nextLine();
        String loaded = input.nextLine();

        // Get user's age
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        // Determine base price
        double basePrice = 0;
        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("No size selected.");
            return;
        }

        // Add charge for loaded
        if (loaded.equalsIgnoreCase("yes")) {
            if (size == 1) {
                basePrice += 1.00;
            } else if (size == 2) {
                basePrice += 1.75;
            }
        }

        // Apply discount
        double discount = 0;
        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }

        double finalPrice = basePrice - (basePrice * discount);

        // Show final price
        System.out.printf("Your total is: $%.2f\n", finalPrice);

        input.close();
    }
}
