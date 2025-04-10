package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Ask user for first number
        System.out.print("Enter the first number: ");
        float firstNumber = input.nextFloat();

// Ask user for second number
        System.out.print("Enter the second number: ");
        float secondNumber = input.nextFloat();

// Ask user what operation they want to do
        System.out.println("\nPossible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.print("Please select an option: ");
        String operation = input.next().toUpperCase();

// Always multiply for this exercise
        float result = firstNumber * secondNumber;
        System.out.println("\n" + firstNumber + " * " + secondNumber + " = " + result);
        input.close();
    }
}
