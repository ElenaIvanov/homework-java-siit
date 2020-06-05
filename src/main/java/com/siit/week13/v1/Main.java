package com.siit.week13.v1;

import lombok.SneakyThrows;

import java.util.Map;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        int ticketCount = RandomTime.getTicketsCount();
        FestivalGate validatedTicket = new FestivalGate();
        FestivalAttendee[] festivalAttendees = new FestivalAttendee[ticketCount];

        for (int i = 0; i < ticketCount; i++) {
            festivalAttendees[i] = new FestivalAttendee(i, validatedTicket);

        }

        FestivalStatistics festivalStatistics = new FestivalStatistics(validatedTicket);
        festivalStatistics.setName("The coolest festival");
        festivalStatistics.setDaemon(true); //set on
//        festivalStatistics.run();
        festivalStatistics.start();

        for(FestivalAttendee festivalAttendee:festivalAttendees){
            festivalAttendee.join();
            Main.printResults(validatedTicket.seeResult(), "The result.");
        }


    }

    public static void printResults(Map<TicketType,Integer> res, String outputMessage){

        for(TicketType ticketType: res.keySet()){
            System.out.println(res.get(ticketType));
        }

    }

}
