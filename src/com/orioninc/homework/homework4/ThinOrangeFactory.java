package com.orioninc.homework.homework4;

import java.util.Random;

public class ThinOrangeFactory extends FruitFactory {
  @Override
  Fruit makeFruit() {
    Random random = new Random();
    return new Orange(random.nextInt(1000), random.nextInt(4) + 1);
  }
}
