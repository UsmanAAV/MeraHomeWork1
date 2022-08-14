package com.orioninc.homework.homework5;

public class Rectangle extends AbstractFigure {
  double width;
  double height;

  Rectangle(double x, double y, double width, double height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  @Override
  double square() {
    return width * height;
  }

  @Override
  public String toString() {
    return "Rectangle - " + square();
  }
}
