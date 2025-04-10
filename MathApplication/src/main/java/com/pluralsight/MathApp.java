package com.pluralsight;

public class MathApp {
    public static void main (String[] args) {

        // Question 1: Compare salaries
        double bobSalary = 90000.0;
        double garySalary = 95000.0;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is $" + highestSalary);

        // Question 2: Smallest car or truck price
        double carPrice = 36000.0;
        double truckPrice = 44000.0;
        double cheapestVehicle = Math.min(carPrice, truckPrice);
        System.out.println("The cheapest vehicle price is $" + cheapestVehicle);

        // Find and display a random number between 0 and 1
        double randomNumber = Math.random();
        System.out.println("A random number between 0 and 1 is: " + randomNumber);
    }
}
