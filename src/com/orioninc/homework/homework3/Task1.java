package com.orioninc.homework.homework3;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        final int surnamesAmount = 6;
        final String[] surnames = new String[] {"Абдуллин", "Ахмадеев", "Газизов", "Ильмурзин", "Вагапов", "Иванов"};

        final int namesAmount = 5;
        final String[] names = new String[] {"Вук", "Мирослав", "Никола", "Макар", "Добрыня", "Марк"};

        final int personsAmount = 50;
        Random random = new Random();
        final Person[] persons = new Person[personsAmount];
        for (int i = 0; i < personsAmount; i++) {
            String name = names[random.nextInt(namesAmount)];
            String surname = surnames[random.nextInt(surnamesAmount)];
            Person person = new Person(name, surname);
            persons[i] = person;
        }

        for (int i = 0; i < personsAmount; i++) {
            System.out.printf("Человек №{%d} - %s\n", i, persons[i]);
        }
    }
}
