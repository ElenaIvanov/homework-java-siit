package com.siit.week11.ex4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciStream {
//    public static void main(String[] args) {
//        FibonacciStream fs = new FibonacciStream();
//        fs.generateFibonacci(100);
//    }

    public List<Integer> generateFibonacci(int series) {
        return Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[0] + i[1]})
                .limit(series)
                .map(i -> i[0])
                .collect(Collectors.toList());
    }
}