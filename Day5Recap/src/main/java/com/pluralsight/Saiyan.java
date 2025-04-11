package com.pluralsight;

public class Saiyan {

    // Attributes, Properties, Instance Variables
    // A blueprint of all the information we would store about the Saiyan
    private String name;
    private int powerLevel;
    private int ki;
    private boolean superSaiyan;

    // Constructor (It's a way to design new Saiyans
    public Saiyan(String name, int powerLevel, int ki) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.ki = ki;
        this.superSaiyan = false; // Default value
    }

    // Create a method to display the info ->
    public void displayInfo() {
        System.out.println("=== Saiyan Status ===");
        System.out.println("Name: " + name);
        System.out.println("Powerlevel: " + powerLevel);
        System.out.println("Ki: " + ki);
        System.out.println("Super Saiyan: " + (superSaiyan ? "Yes 🔥" : "No 🥱"));
        System.out.println("========================");
    }

    // Transform method
    public void transform() {
        if (superSaiyan) {
            System.out.println(name + " is already a Super Saiyan! 🌟");
        } else if (ki >= 500) {
            superSaiyan = true;
            powerLevel += 500;
            ki -= 500; // Use ki to transform
            System.out.println(name + " has transformed into a Super Saiyan! ✨");
        } else {
            System.out.println(name + " doesn't have enough ki to transform! 😵");
        }
    }

    // Train method
    public void train() {
        powerLevel += 500;
        ki += 50;
        System.out.println(name + " is training hard... Power Level is now: " + powerLevel + " 😎");
    }

    // Blast method
    public void blast(Saiyan enemy) {
        if (this.ki >= 30) {
            this.ki -= 30;
            enemy.ki -= 20;

            // prevent enemy ki from dropping below 0
            if (enemy.ki < 0) {
                enemy.ki = 0;
            }
            System.out.println(this.name + " blasts " + enemy.name + " with a Kamehameda 💥!\n " +
                    enemy.name + "'s Ki drops to " + enemy.ki + ". " +
                    this.name + "'s Ki is now " + this.ki + ".");
        } else {
            System.out.println(this.name + " is too tired to blast! 😴");
        }
    }

    // Rest method
    public void rest() {
        int recoveredKi = 100;
        ki += recoveredKi;
        System.out.println(name + " takes some time to rest... Ki restored by " + recoveredKi + ". Current Ki: " + ki + " 💤");
    }

    // Compare Strength of Saiyans method
    public void compareStrength(Saiyan enemy) {
        int strongPower = Math.max(this.powerLevel, enemy.powerLevel);

        if(this.powerLevel == enemy.powerLevel) {
            System.out.println("Both " + this.name + enemy.name + " are equally as strong! 😋");
        } else if (strongPower == this.powerLevel) {
            System.out.println(this.name + " is stronger than " + enemy.name + "! 💪");
        } else {
            System.out.println(enemy.name + " is stronger than " + this.name + "! 💪");
        }
    }
}
