package com.orioninc.homework.homework3;

import java.util.Random;

//Задание 1. Цифровая персонализация
//        - Создать класс Person с двумя полями типа String: firstName, lastName
//        - создать один публичный конструктор с аргументами firstName и lastName. В конструкторе инициализировать поля класса значениями из аргументов.
//        - Для каждого поля определить только getter'ы (без setter'ов) - getFirstName, getLastName , который возвращают соответствующее поле
//        - Создать метод toString() который возвращает человека в формате "Фамилия, Имя"
//
//        в методе main
//        - Создать массив типа String на 5 элементов - туда записать какие-нибудь реальные имена.
//        - Создать массив типа String на 6 элементов - туда записать какие-нибудь реальные фамилии
//        - Создать массив типа Person на 50 элементов - туда записать людей со случайными фамилиями из массивов выше
//        - Вывести всех людей из массива в формате "Человек №{индекс в массиве} - Фамилия, Имя"

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
