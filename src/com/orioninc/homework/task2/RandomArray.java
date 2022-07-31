package com.orioninc.homework.task2;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    int[] array;
    int sum;
    int min;
    int minIndex;

    RandomArray(int size) {
        array = new int[size];
        Random random = new Random();
        int minElement = Integer.MAX_VALUE;
        int minElementIndex = 0;

        for (int i = 0; i < size; i += 1) {
            int element = random.nextInt();
            array[i] = element;
            sum += element;

            if (element < minElement) {
                minElement = element;
                minElementIndex = i;
            }
        }

        min = minElement;
        minIndex = minElementIndex;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    int getSum() {
        return sum;
    }

    int getMinElement() {
        return min;
    }

    int getMinElementIndex() {
        return minIndex;
    }

    int[] getArray() {
        return array;
    }
}
