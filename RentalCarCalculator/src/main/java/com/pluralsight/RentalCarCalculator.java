package com.pluralsight;
import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get pickup date
        System.out.print("Enter pickup date (e.g., 04/15/2025): ");
        String pickupDate = input.nextLine();

        // Number of rental days
        System.out.print("Enter number of rental days: ");
        int rentalDays = input.nextInt();

        input.nextLine();

        // Add-on options
        System.out.print("Add electronic toll tag ($3.95/day)? (yes/no): ");
        String tollTag = input.nextLine();

        System.out.print("Add GPS ($2.95/day)? (yes/no): ");
        String gps = input.nextLine();

        System.out.print("Add roadside assistance ($3.95/day)? (yes/no): ");
        String roadside = input.nextLine();

        // Get driver's age
        System.out.print("Enter your current age: ");
        int age = input.nextInt();

        // Calculate the costs
        double baseRate = 29.99;
        double baseCost = rentalDays * baseRate;

        double optionsCost = 0;
        if (tollTag.equalsIgnoreCase("yes")) {
            optionsCost += rentalDays * 3.95;
        }
        if (gps.equalsIgnoreCase("yes")) {
            optionsCost += rentalDays * 2.95;
        }
        if (roadside.equalsIgnoreCase("yes")) {
            optionsCost += rentalDays * 3.95;
        }

        double underageSurcharge = 0;
        if (age < 25) {
            underageSurcharge = baseCost * 0.30;
        }

        double totalCost = baseCost + optionsCost + underageSurcharge;

        // Display results
        System.out.println("\n---- Rental Car Summary ----");
        System.out.println("Pickup Date: " + pickupDate);
        System.out.printf("Basic Rental Cost: $%.2f\n", baseCost);
        System.out.printf("Options Cost: $%.2f\n", optionsCost);
        System.out.printf("Underage Surcharge: $%.2f\n", underageSurcharge);
        System.out.printf("Total Cost: $%.2f\n", totalCost);

        input.close();
    }
}
