package com.elenaivanov.repositoryforhomework;

public class DisplayPrimeNoFromGivenNumber {

    public static void main(String[] args) {
        int a = 0;
        int b = 10;

        for(a=2; a<b; a++) {
            if(isPrime(a)) {
                System.out.println("The prime numbers less than " + b + " are: " + a);
            }
        }
    }

    private static boolean isPrime(int c) {


        for (int i = 2; i <=Math.sqrt(c); i++) {
            if (c % i == 0)
                return false;
        }
        return true;
    }

}
