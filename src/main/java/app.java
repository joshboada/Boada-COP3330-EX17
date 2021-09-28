/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Josh Boada
 */


import java.util.Scanner;

public class app {
    public static void main( String[] args )
    {
        int alcohol, weight, hours, choice;
        double BAC, r;

        Scanner input= new Scanner(System.in);
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        choice = input.nextInt();

        if (choice==1) {
            r = 0.73;
            System.out.print("How many ounces of alcohol did you have? ");
            alcohol = input.nextInt();
            System.out.print("What is your weight, in pounds? ");
            weight = input.nextInt();
            System.out.print("How many hours has it been since your last drink? ");
            hours = input.nextInt();
            BAC = alcohol * 5.14 / weight * r - 0.015 * hours;
            System.out.println("Your BAC is " + BAC);

            if(BAC<=0.08)
                System.out.println("It is legal for you to drive");
            else
                System.out.println("It is not legal for you to drive");
        }

        else if (choice == 2) {
            r = 0.66;
            System.out.print("How many ounces of alcohol did you have? ");
            alcohol = input.nextInt();
            System.out.print("What is your weight, in pounds? ");
            weight = input.nextInt();
            System.out.print("How many hours has it been since your last drink? ");
            hours = input.nextInt();
            BAC = alcohol * 5.14 / weight * r - 0.015 * hours;
            System.out.println("Your BAC is " + BAC);

            if (BAC <= 0.08)
                System.out.println("It is legal for you to drive");
            else
                System.out.println("It is not legal for you to drive");
        }
        else {

            System.out.print("Invalid command. ");
        }
    }
}