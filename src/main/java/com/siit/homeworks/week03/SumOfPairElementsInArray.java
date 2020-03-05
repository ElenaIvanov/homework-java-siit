package com.siit.homeworks.week03;

public class SumOfPairElementsInArray {

    public static void main(String[] args) {

        findThePairs(new int[] {9, 6, 7, -10, -2, 1, 5, 14}, 8);

        findThePairs(new int[] {9, 8, 11, 19, 6, -4, 3, 1}, 10);

    }

    private static void findThePairs(int[] arrayInput, int givenNo) {
        System.out.println("Pairs of elements whose sum is "+ givenNo +" are : ");

        for (int i = 0; i < arrayInput.length; i++)
        {
            for (int j = i+1; j < arrayInput.length; j++)
            {
                if(arrayInput[i]+arrayInput[j] == givenNo)
                {
                    System.out.println(arrayInput[i]+" + "+ arrayInput[j]+" = "+ givenNo);
                }
            }
        }
    }
}
