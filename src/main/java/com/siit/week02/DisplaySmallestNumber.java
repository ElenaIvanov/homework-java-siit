package com.siit.week02;

import java.util.Scanner;
//not final
public class DisplaySmallestNumber {
    public static void main(String[] args) {

        //creating the array
        int[] num = new int[4];
        int smallestNumber = num[0];
        Scanner scanner = new Scanner(System.in);

        //enter the arrayelements
        System.out.println("Introduce all the numbers of the array: ");

        for(int i = 1; i < num.length; i++) {
            num[i] = scanner.nextInt();
            if(num[i]<smallestNumber){
                smallestNumber = num[i];
            }
        }
        System.out.println("The smallest number in the array is: " + num[0]);
    }
}
