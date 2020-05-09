package com.siit.week10.vote.service;

import com.siit.week10.vote.Person;
import com.siit.week10.vote.repository.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VotingService {
    Scanner sc = new Scanner(System.in);
    public static boolean voting = true;

    public static void main(String[] args) {

        Repository repo = new Repository();
        List<Person> votingPersons = repo.getAllVoters(); //this list contains a list of all voters
        Map<Integer, String> candidates = repo.getAllCandidates(); //this list contains a list of all candidates

//to continue
    }

    public boolean vote(List<Person> listOfCandidates, boolean votingRight) {
        System.out.println("For voting you candidate, please enter you CNP + FULL NAME of the candidate (as shown in the example: 1780927460913 Stefan Cel Mare)");
        String choose = sc.nextLine();


        return votingRight;
    }


    public static void findWinner(String[] votes) {
        Map<String, Integer> vote = new HashMap<>();
        for (String str : votes) {
            if (vote.keySet().contains(str)) {
                vote.put(str, (vote.get(str) + 1));
            } else {
                vote.put(str, 1);
            }
        }

    }


}