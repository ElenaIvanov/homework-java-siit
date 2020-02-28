package com.elenaivanov.repositoryforhomework;
import java.util.*;
public class SumOf100PrimeNumbers {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        int number = 0;

        while (number <= 100) {
            if (isPrime(number)) {
                sum += number;
                count++;
            }
            number++;
        }

        System.out.println("The sum of the prime numbers until 100 is: " + sum);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

