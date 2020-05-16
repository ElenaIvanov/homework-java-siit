package com.siit.week11.ex1;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PairOfSocks {

    public static void main(String[] args) {

        int[] socks = {10,10,10,10,30,50,20,20,20,20,20,20};
        getPairOfSocks(2,socks);
        System.out.println("The output is " + getPairOfSocks(2,socks));
    }

    public static int getPairOfSocks(int n, int[] array) {

        return Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream()
                .mapToInt(a -> (int) (a / 2)).sum();
    }

}

