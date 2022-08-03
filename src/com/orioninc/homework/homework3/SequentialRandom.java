package com.orioninc.homework.homework3;

import java.util.Random;

public class SequentialRandom {
    static int previousValue;
    static boolean isReset = true;
    static int value;

    SequentialRandom() {
        if (isReset) {
            Random random = new Random();
            value = random.nextInt();
            isReset = false;
            return;
        }

        value += 1;
    }

    public int getValue() {
        return value;
    }

    static void resetRandom() {
        isReset = true;
    }
}
