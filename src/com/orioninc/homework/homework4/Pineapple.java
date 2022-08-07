package com.orioninc.homework.homework4;

/**
 * Simple class Pineapple.
 */

public class Pineapple extends Fruit {
  /**
   * The Pineapple's tail's height.
   */
  int tailHeight;
  /**
   * The minimal height available for Pineapple's tail.
   */
  static int MIN_TAIL_HEIGHT = 5;
  /**
   * The maximum height available for Pineapple's tail.
   */
  static int MAX_TAIL_HEIGHT = 20;

  Pineapple(int weight, int tailHeight) {
    super(weight);
    this.tailHeight = tailHeight;
  }

  @Override
  public String toString() {
    return "Pineapple{"
        + "tailHeight=" + tailHeight
        + ", weight=" + weight
        + '}';
  }
}
