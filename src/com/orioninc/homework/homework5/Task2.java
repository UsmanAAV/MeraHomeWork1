package com.orioninc.homework.homework5;

/**
 * 2. Сезонные радости
 * Создайте enum Season с 4 временами года.
 * Создайте enum Games с 4 играми.
 *
 * В каждое время года можно играть ровно в одну игру:
 * Зима - снежки
 * Весна - запуск корабликов по ручьям
 * Лето - собирание и поедание ягод
 * Осень - измерение глубины луж методом "сапога"
 *
 * Создайте класс Person. У него есть имя и любимый сезон.
 * Создайте массив на 10 элементов с людьми со случайными именами и любимыми сезонами.
 *
 * Для каждого человека выведите любимую игру.
 *
 * Рекомендации:
 * в Season определите дополнительное поле - игра для сезона.
 */

public class Task2 {
    public static void main(String[] args) {
        final int personsAmount = 10;

        Person[] persons = new Person[personsAmount];

        for (int i = 0; i < personsAmount; i++) {
            persons[i] = PersonFactory.makePerson();
        }

        for (Person person :
                persons) {
            System.out.println(person);
        }
    }
}
