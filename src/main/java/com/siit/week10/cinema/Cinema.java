package com.siit.week10.cinema;

import com.siit.week05.StringEx.StringMethods;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.*;

@Getter
@Data
@Builder
public class Cinema {
    private String name;


    public Cinema(String name, int numRows, int seatsPerRow, BigDecimal price) {
        this.name = name;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNumber = 1; seatNumber <= seatsPerRow; seatNumber++) {
            Seat seat = new Seat(row + String.format("%02d", seatNumber), price);
            seat.add(seat);
            }
        }
    }
}
