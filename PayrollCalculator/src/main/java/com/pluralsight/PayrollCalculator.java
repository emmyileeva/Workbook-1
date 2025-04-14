package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user's information using helper methods
        String name = getName(input);
        float hoursWorked = getHoursWorked(input);
        float payRate = getPayRate(input);

        // Calculate gross pay based on horus and pay rate
        float grossPay = calculateGrossPay(hoursWorked, payRate);

        // Display the final result
        displayResults(name, grossPay);

        input.close();
    }

    // Method to get user's name
    public static String getName(Scanner input) {
        System.out.println("Enter your name: ");
        return input.nextLine();
    }

    // Method to get hours worked from the user
    public static float getHoursWorked(Scanner input) {
        System.out.println("Enter hours worked: ");
        return input.nextFloat();
    }

    // Method to get pay rate from user
    public static float getPayRate(Scanner input) {
        System.out.println(" Enter your pay rate: ");
        return input.nextFloat();
    }

    // Method to calculate gross pay with overtime logic
    public static float calculateGrossPay(float hours, float rate) {
        if (hours > 40) {
            float overtimeHours = hours - 40;
            return (40 * rate) + (overtimeHours * rate * 1.5f); // Overtime paid at 1.5x
        } else {
            return hours * rate; // Regular pay
        }
    }

    // Method to print the final payroll summary
    public static void displayResults(String name, float grossPay) {
        System.out.println("\n---- Payroll Summary ----");
        System.out.println("Employee Name: " + name);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
    }

}
