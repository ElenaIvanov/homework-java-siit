package com.siit.week11.ex3;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class WallStreetService {

    static Trader raoul = new Trader("Raoul", "Cambridge");

    static Trader mario = new Trader("Mario", "Milan");

    static Trader alan = new Trader("Alan", "Cambridge");

    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    /*
    1. Find all transactions in the year 2011 and sort them by value (small to high).
    2. What are all the unique cities where the traders work?
    3. Find all traders from Cambridge and sort them by name.
    4. Return a string of all traders’ names sorted alphabetically.
    5. Are any traders based in Milan?
    6. Print all transactions’ values from the traders living in Cambridge.
    7. What’s the highest value of all the transactions?
    8. Find the transaction with the smallest value.
     */
//1. Find all transactions in the year 2011 and sort them by value (small to high).
    static List<Transaction> findSortedTransactionsFromYear(int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
//                           .sorted((t1, t2) -> t1.getValue() - t2.getValue())
                .sorted(Comparator.comparingInt(Transaction::getValue))
//                           .collect(Collectors.toCollection(ArrayList::new));
                .collect(toList());
    }

    //  2. What are all the unique cities where the traders work?
    static Set<String> findUniqueCitiesOfTraders() {
        return transactions.stream()
                .map(Transaction::getTrader) //String::isEmpty
                .map(Trader::getCity) //String==city apply(Trader t)
                .collect(Collectors.toSet());
    }

    //  3. Find all traders from Cambridge and sort them by name.
    static Set<String> getTradersFromCambridge(String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    //4. Return a string of all traders’ names sorted alphabetically.
    static Set<String> getAllTradersNamesAlphabetically() {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    //5. Are any traders based in Milan?.
    static long getTraderInMiami(String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .distinct()
                .count();
    }

    //6. Print all transactions’ values from the traders living in Cambridge.
    static long getTransactionValueFromCambrideTraders(String city) {
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals(city))
                .mapToInt(Transaction::getValue)
                .sum();
    }

    //7. What’s the highest value of all the transactions?
    static long getHighestTransactionValue(){
        return transactions.stream()
                .map(Transaction::getValue)
                .max(Comparator.comparing(Integer::intValue))
                .get();
    }


    //8. Find the transaction with the smallest value.
    static long getSmallestTransactionValue(){
        return transactions.stream()
                .map(Transaction::getValue)
                .min(Comparator.comparing(Integer::intValue))
                .get();
    }

}
