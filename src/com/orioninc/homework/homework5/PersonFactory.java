package com.orioninc.homework.homework5;

import java.util.Random;

public class PersonFactory {
    final static String[] names = new String[] { "Cartman", "Kyle", "Stan", "Kenny" };
    static Person makePerson() {
        Random random = new Random();

        String name = names[random.nextInt(4)];
        Season season = Season.values()[random.nextInt(Season.values().length)];

        return new Person(name, season);
    }
}
