package com.siit.homeworks.week03;

import java.util.Scanner;

public class MethodNoOfDaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfDaysInMonth = 0;
        String monthName = "Unknown";

        System.out.print("Insert number of the month: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        System.out.println("The number of the days in the selected month is: "+ monthsOfYear(numberOfDaysInMonth));
    }

    public static int monthsOfYear (int month){
        int year = 0;
        String monthName;
        int numberOfDaysInMonth = 0;

        switch (month) {
            case 1:
                monthName = "January";
                numberOfDaysInMonth = 31;
                break;
            case 2:
                monthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOfDaysInMonth = 29;
                } else {
                    numberOfDaysInMonth = 28;
                }
                break;
            case 3:
                monthName = "March";
                numberOfDaysInMonth = 31;
                break;
            case 4:
                monthName = "April";
                numberOfDaysInMonth = 30;
                break;
            case 5:
                monthName = "May";
                numberOfDaysInMonth = 31;
                break;
            case 6:
                monthName = "June";
                numberOfDaysInMonth = 30;
                break;
            case 7:
                monthName = "July";
                numberOfDaysInMonth = 31;
                break;
            case 8:
                monthName = "August";
                numberOfDaysInMonth = 31;
                break;
            case 9:
                monthName = "September";
                numberOfDaysInMonth = 30;
                break;
            case 10:
                monthName = "October";
                numberOfDaysInMonth = 31;
                break;
            case 11:
                monthName = "November";
                numberOfDaysInMonth = 30;
                break;
            case 12:
                monthName = "December";
                numberOfDaysInMonth = 31;
        }
        return numberOfDaysInMonth;
    }

}
