package com.siit.week13.v2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.SneakyThrows;

@AllArgsConstructor
@Getter
public class FestivalStatisticsThread implements Runnable {
    private final FestivalGate festivalGate;

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            System.out.println(this.festivalGate.seeStatistics());
        }
    }

}
