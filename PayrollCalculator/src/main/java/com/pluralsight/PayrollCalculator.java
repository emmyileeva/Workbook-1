package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user's name
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        // Get hours worked for user
        System.out.println("Enter hours worked: ");
        float hoursWorked = input.nextFloat();

        // Get user's pay rate
        System.out.println("Enter pay rate: ");
        float payRate = input.nextFloat();

        // Calculate user's pay
        float grossPay;
        if (hoursWorked > 40) {
            float overtimeHours = hoursWorked - 40;
            grossPay = (40 * payRate) + (overtimeHours * payRate * 1.5f);
        } else {
            grossPay = hoursWorked * payRate;
        }

        // Output the result
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Gross Pay: " + grossPay);

        input.close();
    }
}
