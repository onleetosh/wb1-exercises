//In this exercise you will create a CLI application for a rental car company.
//prompt the user to answer questions about their selected options and then
//calculate the cost of the rental.

package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nWelcome to the Car Rental ! \nPlease answer the following information.");
        //declared variables with user prompt response
        String pickUpDate = PromptUser("\nPick up date (ex. 10-11-2024): ");
        short numberOfDays = PromptForDays("How many days are you renting? ");
        boolean needTollTag = PromptForYesOrNo("Do you require a toll tag? ");
        boolean needGps = PromptForYesOrNo("Would you like to add GPS ? ");
        boolean needRoadSide = PromptForYesOrNo("Would you like to add Roadside Assistance? ");
        byte age = PromptForAge("What is your enter age? ");

        //declared variables with set values
        double priceOfCarRentalPerDay = 29.99;
        double priceOfTollPerDay = 3.95;
        double priceOfGPSPerDay = 2.95;
        double priceOfRoadsidePerDay = 3.95;
        float underAgeSurgeChargePercent = 0.30f;
        int underAgeCutOffAge = 25;

        //finding the base car rental fee without extra fee
        double baseCarRental = numberOfDays * priceOfCarRentalPerDay;

        //finding additional values with variables declared with if statements  ("?" = if ) | " : 0 " = false
        double costOfTollTag = (needTollTag) ? (numberOfDays * priceOfTollPerDay) : 0;
        double costOfGPS = (needGps) ? (numberOfDays * priceOfGPSPerDay) : 0;
        double roadsideFee = (needRoadSide) ? (numberOfDays * priceOfRoadsidePerDay) : 0;
        double optionTotalFee = costOfTollTag + costOfGPS + roadsideFee;
        double underAgeExtraFree = (age < underAgeCutOffAge) ? baseCarRental * underAgeSurgeChargePercent : 0;
        double totalCost = baseCarRental + optionTotalFee + underAgeExtraFree;

        //display results
        System.out.println("\nThank You! \n\nAfter reviewing the information, here is a summary of the bill: ");
        System.out.printf("\tBasic car rental fee: %.2f \n", baseCarRental);
        System.out.printf("\tOptions fee: %.2f\n", optionTotalFee);
        System.out.printf("\tUnder driver surcharge fee: %.2f \n", underAgeExtraFree);
        System.out.printf("\t_______________________");
        System.out.printf("\n\tTotal cost: \t%.2f", totalCost);
        System.out.println("\n\nENJOY YOUR RENTAL, DRIVE SAFE !!");
    }

    //method called on by the main method to prompt user
    public static String PromptUser(String prompt){
        System.out.print(prompt);
        return input.nextLine();
    }

    //method called on by the main method to prompt user
    public static boolean PromptForYesOrNo(String prompt) {
        System.out.print(prompt + " (Y for yes, N for No ) ");
        String answer = input.nextLine();
        return(answer.equals("Y") || answer.equalsIgnoreCase("Yes"));
    }

    //method called on by the main method to prompt user
    public static short PromptForDays(String prompt){
        System.out.print(prompt);
        short number = input.nextShort();
        input.nextLine();
        return number;
    }

    //method called on by the main method to prompt user
    public  static byte PromptForAge(String prompt){
        System.out.print(prompt);
        byte age = input.nextByte();
        input.nextLine();
        return age;
    }
}