package com.siit.homeworks.week03;

import java.util.Arrays;
//to finish
public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String str = "To be discussed";
        System.out.println(removeDuplicates(str));
    }

    private static String removeDuplicates(String str) {
        //1.Sort the char array
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        str = new String(temp);

        //2. remove the duplicates from the sorted array
        return removeSortedDuplicates(str);
    }

    public static String removeSortedDuplicates(String str) {
        int resultant = 1;
        int input = 1;

        char[] arr = str.toCharArray();
        while (input != resultant) {
            if(arr[input] != arr[input-1]) {
                arr[resultant] = arr[input];
                resultant++;
            }
            input++;
        }
        str = new String(arr);
        return str.substring(0,resultant);
    }
}
