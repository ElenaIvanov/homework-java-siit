package com.siit.week13;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FestivalAttendee extends Thread {
    FestivalGate validatedTicket;
    TicketType ticketType;
    int x;

    public FestivalAttendee(int i, FestivalGate validatedTicket) {
        this.x = i;
        this.validatedTicket = validatedTicket;
    }

    @Override
    public void run() {
        try {
            sleep(RandomTime.getWaitingTime());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        TicketType ticketType = TicketType.values()[RandomTime.getTicketIndex(TicketType.values().length)];
        TicketValidation ticketValidation = new TicketValidation(ticketType);
        this.validatedTicket.validateTicket(ticketValidation);
    }

}
