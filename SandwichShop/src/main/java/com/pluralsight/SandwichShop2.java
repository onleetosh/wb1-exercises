package com.pluralsight;

import java.util.Scanner;

public class SandwichShop2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //prompt use for sandwich size
        System.out.println("\nWelcome to the Sandwich Shop! \n Please select a sandwich size (1 or 2):");
        System.out.println("\n1: Regular (5.45) \n2: Large (8.95)");
        int sandwichSize = input.nextInt();

        //prompt user doe loaded option with yes or no
        System.out.println("\nGreat! Want to LOAD UP your sandwich? (Y for Yes, N for No) ");
        System.out.println("\nAdditional Fees: \nRegular ($1.00) \nLarge ($1.75)");
        String loadChoice = input.next();

        //prompt user for age
        System.out.println("\nOK! What is your age?");
        int age = input.nextInt();

        double price;
        double discount = 0.0;
        double extra;
        if(sandwichSize == 1){
            price = 5.45;
            extra= 1.00;
        }
        //if user selects regular display size and size
        else if(sandwichSize == 2){
            price = 8.95;
            extra = 1.75;
        }
        else {
            System.out.println("error");
            return;
        }

        if(loadChoice.equals("Y")) {
            price += extra; // add an extra fee
        }

        if(age <= 17) {
            discount = 0.10; // 10% discount for students
            System.out.println("Alright! You qualify for a 10% Student discount!");
        }
        else if (age >= 65) {
            discount = 0.20; // 20% discount for senior
            System.out.println("Alright! You qualify for a 20% Senior discount!");

        }
        else {
            System.out.println("I'm sorry, you do not qualify for a discount.");
        }

        //found the total with discount applied
        double applyDiscount = price * discount;
        double total = price - applyDiscount;

        System.out.printf("\nYour total is $%.2f", total);
        System.out.print("\n\tEnjoy!");

    }


}