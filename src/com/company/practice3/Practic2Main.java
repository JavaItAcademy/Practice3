package com.company.practice3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practic2Main {
    static List<Person> people = new ArrayList<>();
    static Set<Person> peopleSet = new HashSet<>();

    public static void main(String[] args) {
        Person Kulanbek = new Person(28, "Kulanbek");
        Person Askhat = new Person(28, "Askhat") ;
        Person Aziret = new Person(28, "Aziret") ;
        addToList(Kulanbek);
        addToList(Askhat);
        addToList(Aziret);

        System.out.println(people);
        System.out.println(peopleSet);
    }

    public static boolean addToList(Person person) {
        for (Person p : people) {
            if (p.getAge() == person.getAge()) {
                peopleSet.add(person);
                return false;
            }
        }
        people.add(person);
        return true;
    }
}
