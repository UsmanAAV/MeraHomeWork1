package com.orioninc.homework.homework4;

import java.util.ArrayList;
import java.util.Random;

/**
 * 2. Фруктовая абстрактность
 * Создать класс AbstractFabric с одним абстрактным методом makeFruit(), который возвращает фрукт.
 * Создайте следующие подклассы:
 * ThinOrangeFactory - которая создает  только апельсины с толщиной кожуры от 1 до 5
 * RedApplesFactory - которая создает только красные яблоки
 * GreenApplesFactory - которая создает только зеленые яблоки.
 * LongPinepplesFactory - которая создает только ананасы с длиной хвоста больше 10
 * Создайте массив на 10 элементов и поместите туда 10 случайных фабрик одного из 4 описанных выше типов.
 * Создайте массив типа Fruit на 20 элементов и заполните его фруктами из всех  фабрик - по 2 фрукта от одной фабрики.
 */

public class Task2 {
  public static void main(String[] args) {
    FruitFactory[] factories = {
        new ThinOrangeFactory(),
        new RedApplesFactory(),
        new GreenApplesFactory(),
        new LongPineapplesFactory(),
    };

    ArrayList<FruitFactory> factories1 = new ArrayList<>();

    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      factories1.add(factories[random.nextInt(4)]);
    }

    Fruit[] fruits = new Fruit[20];

    for (int i = 0; i < 20; i++) {
      fruits[i] = factories1.get(i / 2).makeFruit();
    }

    for (Fruit fruit : fruits) {
      System.out.println(fruit);
    }
  }
}
