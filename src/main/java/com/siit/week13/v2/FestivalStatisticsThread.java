package com.siit.week13.v2;

import lombok.Getter;
import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


@Getter
public class FestivalStatisticsThread implements Runnable {
    private final FestivalGate festivalGate;
    private Map<TicketType, Integer> ticketCount;

    private int personCount;
    private int lastPersonCount;

    public FestivalStatisticsThread(FestivalGate festivalGate) {
        this.festivalGate = festivalGate;
        ticketCount = Arrays.stream(TicketType.values())
                .collect(Collectors.toConcurrentMap(ticketType -> ticketType, v -> 0));
    }

    @SneakyThrows
    @Override
    public void run() {
        while (festivalGate.hasTicket()) {
            Thread.sleep(10);
            TicketType ticketType = festivalGate.getTicket();
            Integer currentCount = ticketCount.get(ticketType);
            ticketCount.put(ticketType, ++currentCount);
        }
        lastPersonCount = personCount;

        personCount = ticketCount.values().stream()
                .reduce(Integer::sum) //returns an Optional describing the reduced value,
                .orElse(0);

        if (personCount == lastPersonCount) {
            synchronized (festivalGate) {
                festivalGate.notifyAll();
            }
        }

        System.out.println("As of now: " + personCount + " persons entered the gate");
        ticketCount.forEach((ticket, ticketCount) -> System.out.println(ticketCount + "persons-> " + ticket));
    }

}
