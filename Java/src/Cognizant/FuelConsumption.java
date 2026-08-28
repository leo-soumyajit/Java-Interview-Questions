package Cognizant;

import java.util.Scanner;

/**
 * 📝 Problem: Truck Fuel Consumption
 *
 * Problem Statement:
 * Calculate the fuel consumption of a truck in both European (Liters/100KM)
 * and US (Miles/gallon) styles.
 *
 * Formulas:
 * - European: (Liters / Distance) * 100
 * - US: Miles / Gallons
 *   (1 KM = 0.6214 Miles, 1 Liter = 0.2642 Gallons)
 *
 * Constraints:
 * - If liters <= 0 or distance <= 0, print "[value] is an Invalid Input" and stop.
 * - Print outputs exactly to 2 decimal places using printf.
 */
public class FuelConsumption {

    public static void calculateFuel(double liters, double distance) {

        // 1. Prothomei check kor input gulo 0 ba negative kina.
        // Jodi hoy, tahole "Invalid Input" print kore return kore de.
        if(liters <=0 || distance <=0){
            System.out.println("Invalid");
            return;
        }


        // 2. European System Calculate kor: (liters / distance) * 100
        double euro = (liters/distance)*100;


        // 3. US System Calculate kor:
        // Prothome distance ke miles e convert kor (distance * 0.6214)
        // Tarpor liters ke gallons e convert kor (liters * 0.2642)
        // Tarpor divide kor (miles / gallons)
        double miles = distance*0.6214;
        double gallons = liters*0.2642;
        double us = miles/gallons;


        // 4. Print kor 2 decimal places-e (printf use kore)
         System.out.printf("Liters/100KM %.2f\n", euro);
         System.out.printf("Miles/gallons %.2f\n",us);


    }

    public static void main(String[] args) {
        // Test Case 1 (From Question)
        double liters1 = 20;
        double distance1 = 150;

        System.out.println("--- Test Case 1 ---");
        System.out.println("Enter the no of liters to fill the tank\n" + (int)liters1);
        System.out.println("Enter the distance covered\n" + (int)distance1);
        System.out.println("Output:");
        calculateFuel(liters1, distance1);
        // Expected Output:
        // Liters/100KM 13.33
        // Miles/gallons 17.64

        // Test Case 2 (Negative Input Case)
        System.out.println("\n--- Test Case 2 ---");
        calculateFuel(-5, 100);
        // Expected Output: -5 is an Invalid Input (or similar format)
    }
}