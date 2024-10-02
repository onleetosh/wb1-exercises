//Different approach - using static methods outside the main method

package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator2 {

    //class level variable. Ever method can use input
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //prompt user for first values
        float num1 = getNumber("\tEnter the first number: ");

        //prompt user for second value
        float num2 = getNumber("\tEnter the second number: ");
        //display the two values entered
        System.out.println("\tYou entered " + num1 + " & " + num2);
        String operation = getOperation();
        System.out.println("\tYou selected: " + operation);

        if (operation.equals("A")) { doAdd(num1, num2); }
        if (operation.equals("S")) { doMinus(num1, num2); }
        if (operation.equals("M")) { doTimes(num1, num2); }
        if (operation.equals("D")) { doDivide(num1, num2); }

    }



    //method used to prompt user for an operation
    public static String getOperation(){
        System.out.println("\nChoose an operation by selecting: A, S, D, or M ");
        System.out.println("\t(A)dd");
        System.out.println("\t(S)ubract");
        System.out.println("\t(D)ivdide");
        System.out.println("\t(M)ultiply");
        String operationSelected = input.next();
        return operationSelected;

    }

    //method used to prompt user for a number
    public static float getNumber(String prompt){
        System.out.print(prompt);
        float num = input.nextFloat();
        input.nextLine();
        return num;
    }

    public static void doAdd(float a, float b) {
        float total = a + b;
        System.out.println("\tResult: " + a + " + " + b + " = " + total);
    }

    public static void doMinus(float a, float b) {
        float total = a - b;
        System.out.println("\tResult: " + a + " - " + b + " = " + total);
    }

    public static void doTimes(float a, float b) {
        float total = a * b;
        System.out.println("\tResult: " + a + " * " + b + " = " + total);
    }

    public static void doDivide(float a, float b) {
        float total = a / b;
        System.out.println("\tResult: " + a + " / " + b + " = " + total);
    }

}