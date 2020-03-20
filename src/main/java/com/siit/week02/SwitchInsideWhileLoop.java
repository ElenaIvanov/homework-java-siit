package com.siit.week02;

import java.util.Scanner;

public class SwitchInsideWhileLoop {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Insert operation type: ");
        String operation = scanner.next();

        while (true) {
            switch (operation) {
                case "+":
                    System.out.println("a+b= " + (a + b));
                    break;
                case "-":
                    System.out.println("a-b= " + (a - b));
                    break;

                case "*":
                    System.out.println("a*b= " + a * b);
                    break;

                case "/":
                    System.out.println("a/b= " + (a / b));
                    break;

                default:
                    System.out.println("Bad operation!!!");
            }
            break;
        }
    }
    private static void printNumberOfDays() {

    }
}
