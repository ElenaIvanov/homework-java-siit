package com.siit.week13.v2;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Service {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        FestivalGate gate = new FestivalGate();
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors
                .newFixedThreadPool(5);
        {
            for (int i = 0; i < 1000; i++) {
                TicketType ticketType = Service.randomTicket();
                FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(
                        ticketType, gate);
                executor.execute(festivalAttendee);
            }
            executor.shutdown();
        }

        FestivalStatisticsThread statsThread = new FestivalStatisticsThread(
                gate);

        statsThread.run();
    }


    private static TicketType randomTicket() {
        return TicketType.values()[RANDOM.nextInt(TicketType.values().length)];
    }
}

