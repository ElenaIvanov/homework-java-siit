package com.siit.week03;

import java.util.Scanner;

public class MethodIfElseCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nChoose you operation type:");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");

        System.out.print("\nWhat would you like to do?: ");
        int choice = scanner.nextInt();

        if (choice == 1){
            addition();
        }
        else if (choice == 2){
            subtraction();
        }
        else if (choice == 3){
            division();
        }
        else if (choice == 4){
            multiplication();
        }

        System.out.println();
        scanner.close();
    }
    public static void addition(){

        int firstNo, secondNo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Addition");

        System.out.println("First Number: ");
        firstNo = scanner.nextInt();

        System.out.println("Second Number: ");
        secondNo = scanner.nextInt();

        scanner.close();
        System.out.println("\nSum: " + firstNo + " + " + secondNo + " = " + (firstNo + secondNo));
    }

    public static void subtraction(){
        int firstNo, secondNo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Subtraction");

        System.out.print("\nFirst Number: ");
        firstNo = scanner.nextInt();

        System.out.print("\nSecond Number: ");
        secondNo = scanner.nextInt();

        scanner.close();
        System.out.println("\nSum: " + firstNo + " - " + secondNo + " = " + (firstNo - secondNo));
    }

    public static void division(){
        int firstNo, secondNo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Division");

        System.out.print("\nFirst Number: ");
        firstNo = scanner.nextInt();

        System.out.print("\nSecond Number: ");
        secondNo = scanner.nextInt();

        scanner.close();
        System.out.println("\nSum: " + firstNo + " / " + secondNo + " = " + (firstNo / secondNo));
    }

    public static void multiplication(){
        int firstNo, secondNo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Multiplication");

        System.out.print("\nFirst Number: ");
        firstNo = scanner.nextInt();

        System.out.print("\nSecond Number: ");
        secondNo = scanner.nextInt();

        scanner.close();
        System.out.println("\nSum: " + firstNo + " x " + secondNo + " = " + (firstNo * secondNo));
    }
}
