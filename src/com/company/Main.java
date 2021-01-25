package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525610);
    }

    public static void printYearsAndDays(long minutes) {

        long year = 525600;
        long calculateYear = minutes / year;
        long calculateDay = minutes % year;

        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + calculateYear + " y and " + calculateDay + " d ");
        }
    }
}


// Returned Value == 525610 min = 1 y and 10 d