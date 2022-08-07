package com.orioninc.homework.homework4;

/**
 * Simple class Apple.
 */

public class Apple extends Fruit {
  /**
   * Color of the Apple.
   */
  Color color;

  public Apple(int weight, Color color) {
    super(weight);
    this.color = color;
  }

  @Override
  public String toString() {
    return "Apple{"
        + "color='" + color + '\''
        + ", weight=" + weight
        + '}';
  }
}
