package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //prompt user for first values
        System.out.print("\tEnter the first number: " );
        float num1 = input.nextFloat();

        //prompt user for second value
        System.out.print("\tEnter the second number: ");
        float num2 = input.nextFloat();

        //display the two values entered
        System.out.println("\n\tYou entered " + num1 + " & " + num2 );

        //display and prompt user for an operation
        System.out.println("\nChoose an operation by selecting: A, S, D, or M " );
        System.out.println("\t(A)dd");
        System.out.println("\t(S)ubract");
        System.out.println("\t(D)ivdide");
        System.out.println("\t(M)ultiply");
        String getOperation = input.next().toUpperCase();
        //display operation picked
        System.out.println("\nOperation selected: " + getOperation);

        double result = 0;
        boolean operation = true;

        //perform addition
        if (getOperation.equals("A")) {
            result = num1 + num2;
            System.out.println("\tResult: " + num1 + " + " + num2 + " = " + result);
            System.out.printf("%f + ");
        }
        //perform substraction
        else if (getOperation.equals("S")) {
            result = num1 - num2;
            System.out.println("\tResult: " + num1 + " - " + num2 + " = " + result);
        }
        //perform multiplication
        else if (getOperation.equals("M")) {
            result = num1 * num2;
            System.out.println("\t Result: " + num1 + " * " + num2 + " = " + result);
        }
        //perform division
        else if (getOperation.equals("D")) {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("\t Result: " + num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("\t Error: number enter cannot divide by zero.");
            }
        } else {
            operation = false;
            System.out.println("\t Error: not an operation.");
        }

    }


}