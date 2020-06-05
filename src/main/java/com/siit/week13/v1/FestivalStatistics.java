package com.siit.week13.v1;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class FestivalStatistics extends Thread {
    private FestivalGate validatedTicket;

    @SneakyThrows
    @Override
    public void run (){
        while (true){
            try{
                sleep(9000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Main.printResults(this.validatedTicket.seeResult(), "Middle message!" );
        }
    }
}
