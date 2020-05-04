package com.siit.week09.treesetexercice;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        TreeSet<Person> treeSet = new TreeSet<Person>();

        Person p1 = Person.builder()
                .name("Victor")
                .age(22)
                .build();

        Person p2 = Person.builder()
                .name("Matei")
                .age(33)
                .build();

        Person p3 = Person.builder()
                .name("Maria")
                .age(27)
                .build();

        Person p4 = Person.builder()
                .name("Cosmina")
                .age(29)
                .build();

        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);

        Iterator<Person> iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            Person currentElement = iterator.next();
            System.out.println(currentElement.getName());
        }

        while (iterator.hasNext()) {
            Person currentElement = iterator.next();
            System.out.println(currentElement.getAge());
        }
    }
}