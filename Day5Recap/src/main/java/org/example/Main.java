package org.example;
import com.pluralsight.Helper;
import com.pluralsight.Saiyan;

public class Main {
    public static void main(String[] args) {

        // An instance (A copy, a version) of a Saiyan
        Saiyan mySaiyan = new Saiyan("Remzoku", 8000,1000 );
        Saiyan enemySaiyan = new Saiyan("Frieza", 10000,2000 );

        // Training
        System.out.println("\n--- Training ---\n");
        mySaiyan.train();
        enemySaiyan.train();

        // Transform
        System.out.println("\n--- Transformations ---\n");
        mySaiyan.transform();
        enemySaiyan.transform();

        // Display info
        System.out.println("\n--- Final Stats ---\n");
        mySaiyan.displayInfo();
        enemySaiyan.displayInfo();

        // Blast
        System.out.println("\n--- Blasts ---\n");
        mySaiyan.blast(enemySaiyan);
        enemySaiyan.blast(mySaiyan);

        // Rest
        System.out.println("\n--- Rest Time ---\n");
        mySaiyan.rest();

        //Which Saiyan is stronger?
        System.out.println("\n--- Who is stronger? ---\n");
        mySaiyan.compareStrength(enemySaiyan);

        // Practice formatting
        float damage = 19.33453253f;
        Helper.showTwoDecimals(damage);

    }
}