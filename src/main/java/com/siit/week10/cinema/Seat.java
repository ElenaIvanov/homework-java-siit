package com.siit.week10.cinema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Set;

@AllArgsConstructor
@Getter
@Builder
public class Seat implements Comparable<Seat> {
    private String seatNumber;
    private boolean reserved;
    private BigDecimal price;
    private Set<Seat> seats;


    public boolean requestSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber, BigDecimal.valueOf(100));
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.println("The seat you are trying to reserve is not available");
            return false;
        }
        return requestedSeat.isReserved();
    }

    public boolean reserve() {
        if (!this.reserved) {
            this.reserved = true;
            System.out.println("The seat no. " + seatNumber + " is now reserved");
            return true;
        } else {
            return false;
        }
    }

    public boolean cancelReservation() {
        if (this.reserved) {
            this.reserved = false;
            System.out.println("Reservation of seat no. " + seatNumber + " is now cancelled");
            return true;
        } else {
            return false;
        }
    }

    public Seat(String s, BigDecimal price) {

    }

    public void add(Seat seat) {
    }

    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareTo(seat.getSeatNumber());
    }
}
