package com.siit.week02;

import java.util.Scanner;

public class CheckPalidrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int checkNumber = scanner.nextInt();

        if(isPalindrome(checkNumber)) {
            System.out.println("The number entered:"+ checkNumber + " is palindrome!");
        } else {
            System.out.println("The number entered: " + checkNumber + " is not palindrome!");
       }
}

    private static boolean isPalindrome (int number) {
        int palindrome = number;
        int reverse = 0;

            //the reverse loop
        while (palindrome != 0) {
            int check = palindrome%10;
            reverse = reverse *10 +check;

            palindrome /= 10;
        }
        if(number==reverse) {
            return true;
        } else {
            return false;
        }
    }
}
