package com.siit.week13.v1;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class FestivalGate {
    public Queue<TicketValidation> checkTicket = new LinkedList<>();

    public void validateTicket(TicketValidation ticketValidation) {
        checkTicket.add(ticketValidation);
        System.out.println(ticketValidation.getTicketValidated());
    }

    Map<TicketType, Integer> seeResult() {
        Map<TicketType, Integer> results = new TreeMap<>();

        for (TicketType TicketType : TicketType.values()) {
            results.put(TicketType, 0);
        }
        for (TicketValidation ticket : checkTicket) {
            results.put(ticket.getTicketValidated(), results.get(ticket.getTicketValidated()));
        }
        return results;
    }
}