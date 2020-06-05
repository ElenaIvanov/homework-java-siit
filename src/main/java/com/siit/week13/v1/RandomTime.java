package com.siit.week13.v1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTime {

    private static int randomFestivalAttendees;

    public static int getWaitingTime() {
        return (new Random()).nextInt(12) + 4;
    }

    public static int getTicketIndex(int size) {
        randomFestivalAttendees = ThreadLocalRandom.current().nextInt(size);
        return randomFestivalAttendees;
    }

    public static int getTicketsCount() {
        randomFestivalAttendees = ThreadLocalRandom.current().nextInt(100, 150 + 1);
        return randomFestivalAttendees;
    }
}
