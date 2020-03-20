package com.siit.week02;

public class RemoveDuplicatesInArray {

    // Add function to return the new size of modified array

    static int removeDuplicates(int arr[], int n)
    {
        // Return, if array is empty
        // or contains a single element
       if (n==0 || n==1)
            return n;

        int[] tempArray = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i=0; i<n-1; i++)
            // If current element is not equal
            // to next element then store that
            // current element
            if (arr[i] != arr[i+1])
                tempArray[j++] = arr[i];

        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        tempArray[j++] = arr[n-1];

        // Modify original array
        for (int i=0; i<j; i++)
            arr[i] = tempArray[i];

        return j;
    }

    public static void main (String[] args)
    {
        int arr[] = {20, 20, 30, 40, 50, 50, 50};
        int n = arr.length;

        n = removeDuplicates(arr, n);

        // Print updated array
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}



