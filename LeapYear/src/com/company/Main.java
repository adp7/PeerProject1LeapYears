package com.company;

public class Main {

    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        if(year % 400 == 0){
            System.out.println("It is a leap year!");
        }
        else if((year % 100 == 0) && (year % 400 != 0)){
            System.out.println("It is a not leap year!");
        }
        else if((year % 4 == 0) && (year % 100 != 0)){
            System.out.println("It is a leap year!");
        }
        else if((year % 4 != 0)){
            System.out.println("It is not a leap year!");
        }
    }
}
