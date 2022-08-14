package com.orioninc.homework.homework5;

public class Person {
    String name;
    Season favoriteSeason;

    public Person(String name, Season favoriteSeason) {
        this.name = name;
        this.favoriteSeason = favoriteSeason;
    }

    @Override
    public String toString() {
        return String.format("%s's favorite game is %s", name, favoriteSeason.getGame());
    }
}
