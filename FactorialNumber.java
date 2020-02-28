package com.elenaivanov.repositoryforhomework;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        int number = 1;
        long factorial = 1;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number you want to calculate the factorial!:");

        number = scanner.nextInt();

        if(number<0) {
            System.out.println("The number entered must not be negative");
        } else {

            for(int i = 2; i<=number; i++) {
                factorial *= i;
            }
        }

        System.out.println("Factorial for the given number is " + factorial);

    }
}
