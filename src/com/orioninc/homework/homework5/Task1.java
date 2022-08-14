package com.orioninc.homework.homework5;

import com.orioninc.homework.homework4.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * 1. Абстрактный супрематизм
 *
 * Создать абстрактный класс Figure, описывающий фигуру на двумерной плоскости с декартовыми координатами центра x,y.
 * В классе объявить абстрактный метод square, который вычисляет площадь фигуры.
 * В классе объявить и реализовать метод getQuadrant(), который возвращает четверть на координатной плоскости, в которой лежит центр фигуры.
 * Для описания четверти используйте Enum с четырьями значениями: I,II,III,IV
 *
 * Создать классы-наследники:
 * Circle - дополнительный параметр радиус, от 0 до 10
 * Rectangle - дополнительные параметры ширина и высота, от 0 до 20.
 *
 * В каждом классе определить метод square, чтобы он правильно считал площадь.
 *
 * в main'e создать массив на 5 элементов типа Figure, заполните любыми фигурами (не обязательно случайными), выведите все фигуры в формате
 * "Название фигуры - площадь"
 */

public class Task1 {
  public static void main(String[] args) {
    Random random = new Random();

    FigureFactory[] factoryTypes = { new CircleFactory(), new RectangleFactory() };

    final int figuresAmount = 5;
    AbstractFigure[] figures = new AbstractFigure[figuresAmount];

    for (int i = 0; i < figuresAmount; i++) {
      figures[i] = factoryTypes[random.nextInt(2)].makeFigure();
    }

    for (AbstractFigure figure:figures) {
      System.out.println(figure);
    }
  }
}
