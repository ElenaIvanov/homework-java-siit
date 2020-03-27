package com.siit.homeworks.week02;

public class CheckIfArrayIsSquare {
// to be done



    public static boolean isSquare(int[][] array) {
        for (int i = 0; i<array.length ;i++) {

            // check for duplicates in each row
            if(duplicates(array[i])) {
                return false;
            }

            // create a column array
            int[] column = new int[array[i].length];
            for(int j = 0; j<array[i].length; j++) {

                // check for duplicates in each column
                if(duplicates(column)) {
                    return false;
                }
            }
        }
        return true;
    }

    public  static boolean duplicates(int[] array) {
        for (int i = 0; i<array.length; i++) {
            for(int j = i+1; j<array.length; j++) {
                if ( array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
