package com.siit.week10.vote;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
@Builder
public class VotingPerson {
    private String lastName;
    private String firstName;
    private String address;
    private String CNP;
    private String idSeries;
    private int idNumber;
}
