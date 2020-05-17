package com.siit.week11.ex1;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class PairOfSocksTest {

    PairOfSocks ps = new PairOfSocks();

    @Test
    public void check_if_pairs_are_counted() {
        int[] socks1 = {1, 2, 22, 4, 5, 6, 7, 8, 9, 10,
                1, 2, 40, 7, 10, 2, 5, 4, 8, 13};
        int res = PairOfSocks.getPairOfSocks(2, socks1);
    }

    @Test
    public void check_if_correct_no_of_pairs_outputed(){
        int[] socks = {1, 2, 22, 4, 5, 6, 7, 8, 9, 10,
                1, 2, 40, 7, 10, 2, 5, 4, 8, 13};
        int sockPairCount = PairOfSocks.getPairOfSocks(20, socks);
        System.out.println("pairs: " + sockPairCount);
        assertThat(sockPairCount, equalTo(7));
    }


}
