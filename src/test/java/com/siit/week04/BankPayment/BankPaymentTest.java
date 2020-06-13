package com.siit.week04.BankPayment;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BankPaymentTest {

    private BankAccount sut;

    @Before
    public void setup() {
        sut = new BankAccount("RO06BRDE0000000");
        sut.setBalance(new BigDecimal(10000));
    }


    @Test
    public void set_positive_balance_and_return_receipt() {
        //Given
        BigDecimal amount = new BigDecimal(8000);

        //When
        String receipt = sut.addMoney(amount);

        //then
        assertThat(receipt).isEqualTo("Successfully added.");
        assertThat(sut.getBalance()).isEqualByComparingTo(new BigDecimal(18000));

    }

    @Test
    public void set_negative_balance_and_fail_to_return_receipt() {
        //Given
        BigDecimal amount = new BigDecimal(-400);

        //When
        String receipt = sut.addMoney(amount);

        //Then
        assertThat(receipt).isEqualTo("Error in returning the receipt. Negative amount!");
        assertThat(sut.getBalance()).isEqualByComparingTo(new BigDecimal(100));
    }
}
