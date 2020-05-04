package com.siit.week09.hashmapexercice;

import lombok.*;

import java.util.*;

@Setter
@Getter
@EqualsAndHashCode
public class Person {

    private String name;
    private int age;

    @Builder
    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return (name.equals(person.getName()) && age == person.getAge());
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }
}

