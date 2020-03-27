package com.siit.week05.StringEx;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethods {

    //Write a method to reverse a given string in place.
    public static StringBuilder reverseString() {
        String input = "String to be reversed";

        StringBuilder anotherInput = new StringBuilder();
        anotherInput.append(input);

        anotherInput = anotherInput.reverse();

        return anotherInput;
    }

    //Write a method to print duplicate characters from a string.
    public static void printDuplicates() {
        String input = "Work from home";
        String character = "";
        String duplicates = "";
        ;
        for (int i = 0; i < input.length(); i++) {
            String current = character.toString(input.charAt(i));
            if(character.contains(current)) {
                if(!duplicates.contains(current)){
                    duplicates += current + ", ";
                }
            }
        }
        System.out.println("Duplicate characters in the input are: " + duplicates);
    }

    //Write a method to check if two strings are anagrams of each other.
    public static void checkIfAnagram (String str1, String str2){
        char [] char1 = str1.toLowerCase().toCharArray();
        char [] char2 = str1.toLowerCase().toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        int lengthChar1 = char1.length;
        int lengthChar2 = char2.length;
        String input1 = new String();
        String input2 = new String();
        for (int i=0; i <= lengthChar1 - 1; i++){
            input1 = input1+ char1[i];
        }
        for (int i=0; i <= lengthChar2-1; i++) {
            input2 = input2 + char2[i];
        }
        if (input1.equals(input2)){
            System.out.println("Input 1 " + str1 + " is an anagram of " + str1);
        }
        else {
            System.out.println("Input 1 " + str1 + " is not an anagram of " + str1);
        }
    }

    //Write a method to find all the permutations of a string.
    //to be dome

    //Write a method to check if a string contains only digits.
    private static Boolean onlyDigits (String input) {

        char[] chr = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            if (chr[i] < '0' || chr[i] > '9') {
                return false;
            }
        }
        return true;
    }

   // Write a method to find duplicate characters in a given string.
   public static void removeChar(String input, char ch) {
       String resultingStr = input.replace(Character.toString(ch), "");
       System.out.println("The new string is " + resultingStr);

   }

    //Write a method to count a number of vowels and consonants in a given string.
    public static void checkVouelOrConson (String str) {
        int vouelCount = 0;
        int consonCount = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vouelCount++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonCount++;
            }
        }
        System.out.println(vouelCount);
        System.out.println(consonCount);
    }


    //Write a method to count the occurrence of a given character in a string.
    public static int countOccurance (String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }



    //Write a method to print the first non-repeated character from a string.
    //to be dome


    //Write a method to convert a given String into int like the atoi().
    //to be dome

    //Write a method to reverse words in a given sentence without using any library method.
    //to be dome

    //Write a method to check if two strings are a rotation of each other.
    //to be done

    //Write a method to check if a given string is a palindrome.
    public static void checkIFPalindrome(String str1, String str2) {
        int length = str1.length();
        for (int i = length - 1; i >= 0; i--)
            str2 = str2 + str1.charAt(i);
        if (str1.equals(str2)) {
            System.out.println("The string is palindrome!Yeey!");
        } else {
            System.out.println("Oh no! The string isn't palindrome!");
        }
    }


    //Write a method to find the length of the longest substring without repeating characters.
    //to be done

    //Given string str, write a method to find the longest palindromic substring in str.
    //to be done

    //Write a method to remove the duplicate character from String.
    //to be done

    //Write a method to remove a given character from String.
    //to be done

    //Given an array of strings, find the most frequent word in a given array,
    // I mean, the string that appears the most in the array. In the case of a tie, ​the string that is the smallest (lexicographically) ​is printed.


        // Write a method to count a number of vowels and consonants in a given string.
        static boolean isVowel(char character) {
            character = Character.toUpperCase(character);
            return (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U');
        }

        static int countVowels(String strV) {
            int count = 0;
            for (int i = 0; i < strV.length(); i++)
                if (isVowel(strV.charAt(i)))
                    ++count;
            return count;
        }

        static boolean isConson(char character) {
            character = Character.toUpperCase(character);

            return !(character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') &&
                    character >= 65 && character <= 90;
        }




        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert the string: ");
            String str = scanner.next();



        }
    }
