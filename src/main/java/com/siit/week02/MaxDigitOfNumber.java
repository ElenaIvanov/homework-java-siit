package com.siit.homeworks.week02;

import java.util.Scanner;

public class MaxDigitOfNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");

        int number = scanner.nextInt();
        int output = 0;

        if(number>0) {
            int max = 0;

            while ((number>0)) {
                int digit = number % 10;
                max = Math.max(max, digit);
                number/=10;
            }
            output = max;
        }

        System.out.println("The max digit of the number entered is " + output);

    }

}
