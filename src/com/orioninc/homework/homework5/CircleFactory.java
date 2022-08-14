package com.orioninc.homework.homework5;

import java.util.Random;

public class CircleFactory extends FigureFactory {
  @Override
  Circle makeFigure() {
    Random random = new Random();
    double radius = (double) random.nextInt(Circle.MAX_RADIUS * 1000) / 1000;
    return new Circle(random.nextDouble(), random.nextDouble(), radius);
  }
}
