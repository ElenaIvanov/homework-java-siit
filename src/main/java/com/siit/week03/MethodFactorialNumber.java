package com.siit.week03;

import java.util.Scanner;

public class MethodFactorialNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number you want to calculate the factorial!:");

        int factorial = scanner.nextInt();

        int sumFac = sumFactorial(factorial);
        System.out.println("The factorial of the given number is " + sumFac);


    }

    public static int sumFactorial(int factorial) {
        int result = 1;

        for (int factor = 2; factor <= factorial; factor++) {
            result *= factor;
        }

        return result;
    }
}
