package com.orioninc.homework.homework5;

public class Circle extends AbstractFigure {
  double radius;
  static final int MIN_RADIUS = 0;
  static final int MAX_RADIUS = 10;

  Circle(double x, double y, double radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  @Override
  double square() {
    return Math.PI * radius * radius;
  }

  @Override
  public String toString() {
    return "Circle - " + square();
  }
}
