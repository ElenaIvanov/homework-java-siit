package com.siit.week09.hashmapexercice;


import org.assertj.core.util.Lists;

import java.util.*;

public class Service {
    public static void main(String[] args) {

        Map<Person, List<Hobbies>> hashMap = new HashMap<>();

        Person person1 = Person.builder()
                .name("Maria")
                .age(22)
                .build();
        Hobbies hobby1 = Hobbies.builder()
                .name("singing")
                .frequency(7)
                .address(Lists.list("Romania"))
                .build();
        Hobbies hobby2 = Hobbies.builder()
                .name("surfing")
                .frequency(2)
                .address(Lists.list("Australia", "Belgia"))
                .build();

        Person person2 = Person.builder()
                .name("Adrian")
                .age(33)
                .build();
        Hobbies hobby3 = Hobbies.builder()
                .name("shipping")
                .frequency(5)
                .address(Lists.list("Belgia", "Holland"))
                .build();
        Hobbies hobby4 = Hobbies.builder()
                .name("american football")
                .frequency(4)
                .address(Lists.list("United States of America"))
                .build();

        Person person3 = Person.builder()
                .name("Victor")
                .age(22)
                .build();
        Hobbies hobby5 = Hobbies.builder()
                .name("football")
                .frequency(7)
                .address(Lists.list("Rusia", "Engalnd"))
                .build();
        Hobbies hobby6 = Hobbies.builder()
                .name("tenis")
                .frequency(5)
                .address(Lists.list("Mexico", "Sri Lanka"))
                .build();

        Hobbies.put(person1, Lists.list(hobby1, hobby2, hobby3));
        Hobbies.put(person2, Lists.list(hobby4, hobby5, hobby1));
        Hobbies.put(person3, Lists.list(hobby6, hobby2));



        Hobbies.forEach((key, value) -> System.out.println(key.getName() +
                " hobby name: " + value.getName() +
                " and hobby location: " + index.getAdress()));
    }

//    Set set = hashMap.entrySet();
//    Iterator iterator = set.iterator();

}

