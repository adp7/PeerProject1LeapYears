package com.company;

public class Main {

    public static void main(String[] args) {
        int year = 0;
        if(args.length!=0) {
            try {
                year = Integer.parseInt(args[0]);
            } catch (NumberFormatException nfe) {
                System.err.println("Please enter a number!");
            }

            if (year < 0) {
                System.err.println("Year shouldn't be negative");
            }

            LeapClass obj = new LeapClass();
            if (obj.isLeapYear(year))
                System.out.println("It is a leap year!");
            else
                System.out.println("It is not a leap year!");
        }
        else
            System.err.println("Input is 0");
    }
}
