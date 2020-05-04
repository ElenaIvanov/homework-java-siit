package com.siit.week09.hashmapexercice;

import lombok.*;

import java.util.List;

@Setter
@Getter

public class Hobbies {


    private String name;
    private int frequency;
    private List<String> address;

    @Builder
    private Hobbies(String name, int frequency, List<String> address) {
        this.name = name;
        this.frequency = frequency;
        this.address = address;
    }
}
