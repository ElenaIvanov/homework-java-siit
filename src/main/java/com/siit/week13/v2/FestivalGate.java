package com.siit.week13.v2;

import lombok.SneakyThrows;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;

public class FestivalGate {
    private Queue<TicketType> queue = new LinkedBlockingDeque<>();

    public synchronized void setAttendees(TicketType ticketType) {
        queue.add(ticketType);
    }

    @SneakyThrows
    public synchronized Map<TicketType, Integer> seeStatistics() {
        Map<TicketType, Integer> all = new ConcurrentHashMap<>();
        int count;
        for (TicketType ticketType : queue) {
            count = all.containsKey(ticketType) ? all.get(ticketType) : 0;
            all.put(ticketType, count + 1);
        }

        wait(10000);
        int sum = 0;
        for (int x : all.values()) {
            sum += x;
        }
        System.out.println("Total no. of tickets checked are: " + sum);
        notifyAll();
        return all;
    }

    public TicketType getTicket() {
        return queue.poll();
    }

    public boolean hasTicket() {
        return !queue.isEmpty();
    }
}
