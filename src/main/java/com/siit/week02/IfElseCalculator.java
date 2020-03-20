package com.siit.week02;

import java.util.Scanner;

public class IfElseCalculator {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert numbers: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Insert operation type: ");
        String operation = scanner.next();


        if(operation.equals("+")) {
            System.out.println("a+b= " + (a + b));
        } else if(operation.equals("-")) {
            System.out.println("a-b= " + (a - b));
        } else if(operation.equals("*")) {
            System.out.println("a*b= " + a * b);
        } else if(operation.equals("/")) {
            System.out.println("a/b= " + (a / b));
        } else {
            System.out.println("Bad operation!!!");
        }

    }


    //un program care sa afiseze nr de zile pt fiecare luna
    //input: numele lunii sau indexul

    private static void printNumberOfDays() {

    }
}
