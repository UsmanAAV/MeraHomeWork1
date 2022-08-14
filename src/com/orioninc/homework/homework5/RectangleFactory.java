package com.orioninc.homework.homework5;

import java.util.Random;

public class RectangleFactory extends FigureFactory {
  @Override
  Rectangle makeFigure() {
    Random random = new Random();
    double width = (double) random.nextInt(1000) / 100;
    double height = (double) random.nextInt(1000) / 100;
    return new Rectangle(random.nextDouble(), random.nextDouble(), width, height);
  }
}
