package com.orioninc.homework.homework4;

/**
 * Base class for creating fruits.
 */

public class Fruit {
  /**
   * Weight of the Fruit.
   * */
  int weight;

  /**
   * Creates an instance of Fruit.
   *
   * @param weight weight of the Fruit.
   */
  public Fruit(int weight) {
    this.weight = weight;
  }

  /**
   * Overrides parent's toString method.
   *
   * @return Prettified string with Fruit info.
   */
  @Override
  public String toString() {
    return "Fruit{"
        + "weight=" + weight
        + '}';
  }
}
