package com.siit.week10.vote.repository;

import com.siit.week10.vote.VotingPerson;
import lombok.Data;

import java.util.*;

import static com.siit.week10.vote.VotingPerson.*;

@Data
public class Repository {
    public final static List<VotingPerson> listOfVoters = new ArrayList<>();
    public final static Map<Integer, String> candidates = new HashMap<>();

    VotingPerson vp1 = VotingPerson.builder()
            .lastName("Ion")
            .firstName("Andreea")
            .address("Nowhere, no. 3")
            .CNP("292092626913")
            .idNumber(123456)
            .idSeries("XP")
            .build();
    VotingPerson vp2 = VotingPerson.builder()
            .lastName("Mihai")
            .firstName("Marin")
            .address("Balta Alba, no. 4")
            .CNP("192092626234")
            .idNumber(123345)
            .idSeries("DP")
            .build();
    VotingPerson vp3 = VotingPerson.builder()
            .lastName("Vasile")
            .firstName("Maria")
            .address("Somewhere, no. 5")
            .CNP("292092626923")
            .idNumber(267434)
            .idSeries("CI")
            .build();
    VotingPerson vp4 = VotingPerson.builder()
            .lastName("Maria")
            .firstName("Andrei")
            .address("Rainbow, no. 6")
            .CNP("192092726914")
            .idNumber(243789)
            .idSeries("DP")
            .build();
    VotingPerson vp5 = VotingPerson.builder()
            .lastName("Irod")
            .firstName("Adriana")
            .address("Sulina, no. 175")
            .CNP("293093626813")
            .idNumber(345698)
            .idSeries("CI")
            .build();
    VotingPerson vp6 = VotingPerson.builder()
            .lastName("Miron")
            .firstName("Cosmina")
            .address("Under the sea, no. 99")
            .CNP("291092626912")
            .idNumber(567890)
            .idSeries("DP")
            .build();
    VotingPerson vp7 = VotingPerson.builder()
            .lastName("Peppa")
            .firstName("Pig")
            .address("Cartoons, no. 8")
            .CNP("288092626234")
            .idNumber(567234)
            .idSeries("XP")
            .build();
    VotingPerson vp8 = VotingPerson.builder()
            .lastName("Draghia")
            .firstName("Vladimir")
            .address("Bucuresti, no. 100")
            .CNP("179092626913")
            .idNumber(345678)
            .idSeries("XP")
            .build();
    VotingPerson vp9 = VotingPerson.builder()
            .lastName("Patrula")
            .firstName("Catelusilor")
            .address("CartoonNetwork, no. 77")
            .CNP("192092626913")
            .idNumber(23445)
            .idSeries("XP")
            .build();
    VotingPerson vp10 = VotingPerson.builder()
            .lastName("Corvin")
            .firstName("Matei")
            .address("Elsewhere, no. 39")
            .CNP("192092626912")
            .idNumber(456875)
            .idSeries("XP")
            .build();

    public Repository(){

    candidates.put(0, "Alexandru Ioan Cuza");
    candidates.put(1, "Stefan Cel Mare");
    candidates.put(2, "Donald Trump");
}


}
