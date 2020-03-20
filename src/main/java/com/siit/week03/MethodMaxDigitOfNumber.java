package com.siit.week03;

import java.util.Scanner;

public class MethodMaxDigitOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");

        int number = scanner.nextInt();

        System.out.println("The maximum digit in the number is " + maximum(number));
    }

    private static int maximum(int number) {
        int output=0;
        if (number > 0) {
            int max = 0;

            while ((number > 0)) {
                int digit = number % 10;
                max = Math.max(max, digit);
                number /= 10;
            }
            output = max;
        }
        return output;
    }
}
