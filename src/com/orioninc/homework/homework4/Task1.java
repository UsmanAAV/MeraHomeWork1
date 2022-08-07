package com.orioninc.homework.homework4;

import java.util.Random;

/**
 * Задача 1 - Фруктовая неоднозначность.
 * <ol>
 * <li>Создать класс Fruit со свойством "вес" типа int и методом toString</li>
 * <li>Создать наследники:
 * <ul>
 * <li>Apple - с дополнительным свойством цвет (красное, зеленое, желтое) - String</li>
 * <li>Orange - с дополнительном свойством толщина кожуры - int от 0 до 20</li>
 * <li>Pineapple - с дополнительным свойством - высота хвоста - int, от 5 до 20</li>
 * </ul>
 * </li>
 * <li>Переопределить во всех фруктах toString, чтобы выводил все свойства фрукта и тип фрукта
 * (яблоко, апельсин, ананас)</li>
 * <li>Создать метод getRandomFruit - которое возвращает случаный фрукт
 * со случайными характеристиками.</li>
 * <li>Создать массив типа Fruit,
 * заполнить его 4 разными случаными фруктами и вывести их на экран</li>
 * </ol>
*/

public class Task1 {
  static final int AVAILABLE_FRUITS_AMOUNT = 3;

  static Fruit getRandomFruit() {
    Random random = new Random();
    int weight = random.nextInt(1000);
    switch (random.nextInt(AVAILABLE_FRUITS_AMOUNT)) {
      case 0:
        return new Apple(weight, Color.values()[random.nextInt(Color.values().length)]);
      case 1:
        return new Orange(weight, random.nextInt(Orange.MAX_PELL_THICKNESS + 1));
      default:
        return new Pineapple(
          weight,
          random.nextInt(Pineapple.MAX_TAIL_HEIGHT - Pineapple.MIN_TAIL_HEIGHT + 1)
            + Pineapple.MIN_TAIL_HEIGHT
        );
    }
  }

  /**
   * main method.
   */
  public static void main(String[] args) {
    final int fruitsAmount = 4;
    Fruit[] fruits = new Fruit[fruitsAmount];

    for (int i = 0; i < fruitsAmount; i++) {
      fruits[i] = getRandomFruit();
    }

    for (int i = 0; i < fruitsAmount; i++) {
      System.out.println(fruits[i]);
    }
  }
}
