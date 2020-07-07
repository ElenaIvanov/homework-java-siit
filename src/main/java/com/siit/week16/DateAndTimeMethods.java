package com.siit.week16;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;

public class DateAndTimeMethods {

    //    Write a method that, for a given year, reports the length of each month within that year.

    public Map<Month, Integer> lengthOfMonthInYear(Year givenYear) {
        if (givenYear == null) {
            return Collections.emptyMap();
        }
        return Arrays.stream(Month.values())
                .collect(Collectors.toUnmodifiableMap(month -> month, month -> month.length(givenYear.isLeap())));
    }

//    Write a method that, for a given month of the current year, lists all of the Mondays in that month.


    public List<Integer> getMondaysFromGivenMonth(int monthNo) {
        List<Integer> mondays = new ArrayList<>();

        if (monthNo > 12 || monthNo < 1) {
            return mondays;
        }
        LocalDate today = LocalDate.now();
        int year = today.getYear();

        LocalDate date = LocalDate.of(year, monthNo, 1);
        int daysOfMonth = date.lengthOfMonth();

        for (int day = 1; day <= daysOfMonth; day++) {
            LocalDate newDate = LocalDate.of(year, monthNo, day);
            if (newDate.getDayOfWeek() == DayOfWeek.MONDAY) {
                mondays.add(day);
            }
        }
        return mondays;
    }

    //    Write an example that tests whether a given date occurs on Friday the 13th.
    public boolean isFridayThe13th(LocalDate date) {
        if (date == null) {
            return false;
        }
        return date.getDayOfMonth() == 13 && date.getDayOfWeek() == DayOfWeek.FRIDAY;
    }
}
