package com.orioninc.homework.homework4;

import java.util.Random;

public class LongPineapplesFactory extends FruitFactory {
  @Override
  Fruit makeFruit() {
    Random random = new Random();
    return new Pineapple(
        random.nextInt(1000),
        random.nextInt(Pineapple.MAX_TAIL_HEIGHT + 1 - 10) + 10
    );
  }
}
