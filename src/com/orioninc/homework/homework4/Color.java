package com.orioninc.homework.homework4;

/**
 * Enum for colors of the fruits. 'RED', 'GREEN' or 'YELLOW'.
 */

public enum Color {
  RED, GREEN, YELLOW;

  @Override
  public String toString() {
    switch (this) {
      case RED: return "Red";
      case GREEN: return "Green";
      case YELLOW: return "Yellow";
      default: throw new RuntimeException("Unprocessed color in the Color enum");
    }
  }
}