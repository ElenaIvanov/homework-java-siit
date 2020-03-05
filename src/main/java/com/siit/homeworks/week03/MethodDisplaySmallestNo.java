package com.siit.homeworks.week03;

public class MethodDisplaySmallestNo {

    private static int getSmallest(int[] first, int total) {
        int temp;
        for(int i=0; i<total; i++) {
            for (int j=i+1; j<total; j++) {
                if(first[i]>first[j]) {
                    temp=first[i];
                    first[i]=first[j];
                    first[j]=temp;
                }
            }
        }
        return first[0];
    }

    ;

    public static void main(String[] args) {
        int[] first = {1, 2, 5, 6, 3, -7, 9};
        int[] second = {12, 16, 999, 32, 3, 22, 78};

        System.out.println("The smallest number in the array is: " + getSmallest(first, 6));
        System.out.println("The smallest number in the array is: " + getSmallest(second, 6));

    }
}
