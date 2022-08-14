package com.orioninc.homework.homework4;

import java.util.Random;

public class RedApplesFactory extends FruitFactory {
  @Override
  Fruit makeFruit() {
    Random random = new Random();
    return new Apple(random.nextInt(1000), Color.RED);
  }
}
