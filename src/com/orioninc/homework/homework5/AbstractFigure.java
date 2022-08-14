package com.orioninc.homework.homework5;

public abstract class AbstractFigure {
  double x;
  double y;

  abstract double square();

  static String getCoordinateSign(double coordinate) {
    if (coordinate > 0) {
      return "+";
    }
    if (coordinate < 0) {
      return "-";
    }
    return "";
  }

  Quadrant getQuadrant() throws Exception {
    String pointCoordinatesSigns = String.format("%s/%s", getCoordinateSign(x), getCoordinateSign(y));
    switch (pointCoordinatesSigns) {
      case "+/+":
        return Quadrant.I;
      case "-/+":
        return Quadrant.II;
      case "-/-":
        return Quadrant.III;
      case "+/-":
        return Quadrant.IV;
      default: {
        System.out.println("The center of the circle does not belong to any quadrant");
        throw new Exception("The center of the circle does not belong to any quadrant");
      }
    }
  }

  abstract public String toString();
}
