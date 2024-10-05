package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to the Payroll Calculator.");
        System.out.print("Enter your name: ");
        String userName = input.nextLine().trim();

        System.out.print("Number of work hours: ");
        double workHours = input.nextFloat();

        System.out.print("Pay rate per hour: ");
        double payRate = input.nextFloat();

        System.out.print("Number of pay periods: ");
        double payPeriods = input.nextFloat();

        double grossPay =  payRate * workHours;
        double annualSalary = grossPay * payPeriods;

        System.out.println("______________________");
        System.out.printf(userName + "'s Gross Rate: $%.2f", grossPay);
        System.out.printf("\n     Annual salary: $%.2f", annualSalary);

        double lowIncome = 48000;
        double highIncome = 80000;
        
        //print different message based on annual salary result
        if (annualSalary <= lowIncome){
            System.out.println("\nHow are you surviving? Look into a Second income!");
        }
        else if (annualSalary >= highIncome){
            System.out.println("\nOK Big Baller! Work Hard, Pay Hard!");
        }
        else {
            System.out.println("\nGet that overtime! The money train never stops!");
        }



    }
}
