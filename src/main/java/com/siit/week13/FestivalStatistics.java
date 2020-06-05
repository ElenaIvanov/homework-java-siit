package com.siit.week13;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FestivalStatistics extends Thread {
    private FestivalGate validatedTicket;

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
