package com.orioninc.homework.homework2;

//Задание 3. Противоположности притигиваются
//        - Создайте два массива на 7 элементов.
//        - Используюте функцию Random.nextInt() чтобы полностью заполнить два массива: в первом массиве должно оказаться ровно 7 положительных чисел, во втором - ровно 7 отрицательных.
//        Подсказка: используйте цикл while во время генерации случайных чисел и проверку на заполненность массива, прежде, чем записывать туда элемент.
//        - Выведите оба массива на экран
//        - Создайте новый массив на 7 элементов.
//        Значением на каждой позиции является суммой значений на позициях с тем же индексом из положительного и отрицательного массива.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        final int arraySize = 7;

        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        boolean isPositiveNumbersFilled = false;
        boolean isNegativeNumbersFilled = false;
        Random random = new Random();

        while (!isPositiveNumbersFilled || !isNegativeNumbersFilled) {
            int number = random.nextInt();
            if (number > 0 && positiveNumbers.size() < arraySize) {
                positiveNumbers.add((number));
                if (positiveNumbers.size() == arraySize) {
                    isPositiveNumbersFilled = true;
                }
            }
            if (number < 0 && negativeNumbers.size() < arraySize) {
                negativeNumbers.add((number));
                if (negativeNumbers.size() == arraySize) {
                    isNegativeNumbersFilled = true;
                }
            }
        }

        System.out.printf("Массив из %s положительных чисел: %s\n", arraySize, positiveNumbers);
        System.out.printf("Массив из %s отрицательных чисел: %s\n", arraySize, negativeNumbers);

        int[] arrayOfSums = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arrayOfSums[i] = positiveNumbers.get(i) + negativeNumbers.get(i);
        }

        System.out.printf("Массив сумм элементов: %s\n", Arrays.toString((arrayOfSums)));
    }
}
