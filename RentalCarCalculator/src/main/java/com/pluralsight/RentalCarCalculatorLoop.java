package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculatorLoop {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        //create a boolean loop
        do {

            System.out.println("\nWelcome to the Car Rental ! \nPlease answer the following questions.");
            //declare variables
            String pickUpDate = PromptUser("\nPick up date (ex. 10-11-2024): ");
            short numberOfDays = PromptForDays("How many days are you renting? ");
            boolean needTollTag = PromptForYesOrNo("Do you require a toll tag? ");
            boolean needGps = PromptForYesOrNo("Would you like to add GPS ? ");
            boolean needRoadSide = PromptForYesOrNo("Would you like to add Roadside Assistance? ");
            byte age = PromptForAge("What is your enter age? ");

            //declaring variables
            double priceOfCarRentalPerDay = 29.99;
            double priceOfTollPerDay = 3.95;
            double priceOfGPSPerDay = 2.95;
            double priceOfRoadsidePerDay = 3.95;
            float underAgeSurgeChargePercent = 0.30f;
            int underAgeCutOffAge = 25;

            double baseCarRental = numberOfDays * priceOfCarRentalPerDay;

            //variables declared with if statements  ("?" = if ) | " : 0 " = false
            double costOfTollTag = (needTollTag) ? (numberOfDays * priceOfTollPerDay) : 0;
            double costOfGPS = (needGps) ? (numberOfDays * priceOfGPSPerDay) : 0;
            double roadsideFee = (needRoadSide) ? (numberOfDays * priceOfRoadsidePerDay) : 0;
            double optionTotalFee = costOfTollTag + costOfGPS + roadsideFee;
            double underAgeExtraFree = (age < underAgeCutOffAge) ? baseCarRental * underAgeSurgeChargePercent : 0;
            double totalCost = baseCarRental + optionTotalFee + underAgeExtraFree;

            //display results
            //display results
            System.out.println("\nThank You! \n\nAfter reviewing the information, here is a summary of the bill:");
            System.out.printf("\t_______________________\n");
            System.out.printf("\tBasic car rental fee:   %.2f \n", baseCarRental);
            System.out.printf("\tOptional fee:            %.2f\n", optionTotalFee);
            System.out.printf("\tUnderage surcharge fee: %.2f \n", underAgeExtraFree);
            System.out.printf("\t_______________________");
            System.out.printf("\n\tTotal cost: \t%.2f", totalCost);
            System.out.println("\n\nENJOY YOUR RENTAL, DRIVE SAFE !!");

        }
        //will loop until user responds with NO
        while (PromptForYesOrNo("\nWould you like to rent another car?"));

    }


    public static String PromptUser(String prompt){
        System.out.print(prompt);
        return s.nextLine();
    }

    public static boolean PromptForYesOrNo(String prompt) {

        // a loop that will keep prompting user until for correct into
        while (true) {
            System.out.print(prompt + " (Y for yes, N for No ) ");
            String answer = s.nextLine();
            //will loop until a valid response
            if (answer.equals("Y") || answer.equalsIgnoreCase("Yes")){
                return true;
            }
            else if (answer.equals("N") || answer.equalsIgnoreCase("No")){
                return false;
            }
            else {
                System.out.println("Invalid entry, please respond with a 'Y' or 'N'");
            }

        }


    }

    public static short PromptForDays(String prompt){
        System.out.print(prompt);
        short number = s.nextShort();
        s.nextLine();
        return number;
    }
    public  static byte PromptForAge(String prompt){
        System.out.print(prompt);
        byte age = s.nextByte();
        s.nextLine();
        return age;
    }
}