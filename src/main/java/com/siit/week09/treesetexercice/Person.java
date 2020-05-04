package com.siit.week09.treesetexercice;


import lombok.Builder;
import lombok.Data;

@Data
public class Person {
    private String name;
    private int age;

    @Builder
    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int compareAge(Person p1, Person p2) {
        if (p1.getAge() == p2.getAge()) {
            return 0;
        } else if (p1.getAge() < p2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }

    public int compareName(Person p1, Person p2) {
        return (int) p1.getName().compareTo(p2.getName());
    }
}
