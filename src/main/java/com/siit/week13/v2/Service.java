package com.siit.week13.v2;

import lombok.SneakyThrows;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Service {
    private static final Random RANDOM = new Random();

    @SneakyThrows
    public static void main(String[] args) {
        FestivalGate gate = new FestivalGate();
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(6);
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

        Thread.sleep(5000);
        statsThread.run();
    }


    private static TicketType randomTicket() {
        return TicketType.values()[RANDOM.nextInt(TicketType.values().length)];
    }
}

