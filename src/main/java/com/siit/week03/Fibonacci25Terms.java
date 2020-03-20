package com.siit.week03;

public class Fibonacci25Terms {
    public static void main(String[] args) {
        fibonacci(25);

    }
    public static void fibonacci(int number){

        for(int i = 0; i<= number; ++i) {
            System.out.println(getFibonacci(i) + " ");
        }

    }

    public static int getFibonacci(int n) {
        //declaring local variables
        int firstNo = 0;
        int secondNo = 1;
        int sumNo = 1;

        if(n==0){
            return 0;
        }
        if(n==1) {
            return 1;
        }
        for (int i = 2;i <=n; i++) {
            sumNo = firstNo+secondNo;
            firstNo=secondNo;
            secondNo=sumNo;
        }
        return sumNo;
    }
}
