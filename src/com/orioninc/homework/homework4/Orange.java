package com.orioninc.homework.homework4;

/**
 * Simple class Orange.
 */

public class Orange extends Fruit {
  /**
   * Peel thickness of the Orange.
   */
  int peelThickness;
  /**
   * The maximum thickness available for Orange's peel.
   */
  static int MAX_PELL_THICKNESS = 20;

  Orange(int weight, int peelThickness) {
    super(weight);
    this.peelThickness = peelThickness;
  }

  @Override
  public String toString() {
    return "Orange{"
        + "peelThickness=" + peelThickness
        + ", weight=" + weight
        + '}';
  }
}
