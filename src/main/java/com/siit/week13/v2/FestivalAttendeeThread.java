package com.siit.week13.v2;

import lombok.AllArgsConstructor;

import java.util.Random;

@AllArgsConstructor
public class FestivalAttendeeThread implements Runnable {
    private final TicketType ticketType;
    private final FestivalGate festivalGate;

    @Override
    public void run() {
        Random random = new Random();
        try {
            synchronized (this) {
                wait(random.nextInt(500));
            }
            this.festivalGate.setAttendees(ticketType);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
