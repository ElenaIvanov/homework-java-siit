package com.siit.week11.ex3;


import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class WallStreetTest {
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
    WallStreetService ws = new WallStreetService();

    //1. Find all transactions in the year 2011 and sort them by value (small to high).
    @Test
    public void check_highest_transactions_from_2011() {

        List<Transaction> input = ws.findSortedTransactionsFromYear(2011);
        List<Transaction> result = new ArrayList<>();
        result.add(new Transaction(brian, 2011, 300));
        result.add(new Transaction(raoul, 2011, 400));
        assertThat(input, IsIterableContainingInOrder.contains(result.toArray()));
    }

    //    2. What are all the unique cities where the traders work?
    @Test
    public void check_list_of_unique_cities() {
        Set<String> input = ws.findUniqueCitiesOfTraders();
        List<String> result = new ArrayList<>();
        result.add("Cambridge");
        result.add("Milan");
        assertThat(input, IsIterableContainingInOrder.contains(result.toArray()));
    }

    // 3. Find all traders from Cambridge and sort them by name.
    @Test
    public void check_all_sorted_traders_from_Cambridge() {
        Set<String> input = ws.getTradersFromCambridge("Cambridge");
        List<Trader> result = new ArrayList<>();
        result.add(alan);
        result.add(brian);
        result.add(raoul);
        assertThat(input, IsIterableContainingInOrder.contains(result.toArray()));
    }

    //            4. Return a string of all traders’ names sorted alphabetically.
    @Test
    public void check_returned_string_of_sorted_traders() {
        Set<String> input = ws.getAllTradersNamesAlphabetically();
        List<Trader> result = new ArrayList<>();
        result.add(alan);
        result.add(brian);
        result.add(mario);
        result.add(raoul);

        assertThat(input, IsIterableContainingInOrder.contains(result.toArray()));
    }

    //    5. Are any traders based in Milan?
    @Test
    public long check_how_many_traders_are_based_in_milan() {
        long input = ws.getTraderInMilan("Milan");
        long expected = 1;
        assertEquals(input, expected);
    }

    //            6. Print all transactions’ values from the traders living in Cambridge.
    @Test
    public void check_sumof_transactions_of_traders_living_in_cambridge() {
        long input = ws.getTransactionValueFromCambrideTraders("Cambridge");
        long expected = 2000;
        assertEquals(input, expected);
    }


    //    7. What’s the highest value of all the transactions?
    @Test
    public void check_highest_value_of_transactions() {
        long input = ws.getHighestTransactionValue();
        long result = 1000;
        assertEquals(input, result);
    }

    //            8. Find the transaction with the smallest value.
    @Test
    public void check_smallest_value_of_transactions() {
        long input = ws.getSmallestTransactionValue();
        long result = 300;
        assertEquals(input, result);
    }

}

