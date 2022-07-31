package com.orioninc.homework.homework2;

//Задание 2. Случайности расходятся
//        - Создать массив на 5 элементов типа int и вывести на экран
//        - Разделить на два других - в первом массиве только четные числа, во втором - только нечетные. Оба массива вывести на экран.
//        - Найти среднее значение в каждом массива и вывести их на экран

import java.util.ArrayList;

public class Task2 {

    static float getAverage(ArrayList<Integer> arrayList) {
        float sum = 0;
        for (int element: arrayList) {
            sum += element;
        }

        if (arrayList.size() == 0) {
            throw new RuntimeException("Array should have at least one item");
        }

        return sum / arrayList.size();
    }

    public static void main(String[] args) {
        final int arraySize = 5;
        RandomArray randomArray = new RandomArray(arraySize);
        int[] array = randomArray.getArray();
        System.out.println("Массив из " + arraySize + " случайных элементов: " + randomArray);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < arraySize; i += 1) {
            int element = array[i];
            if (element % 2 == 0) {
                evenNumbers.add(element);
            } else {
                oddNumbers.add(element);
            }
        }

        System.out.println("Массив четных чисел: " + evenNumbers);
        System.out.printf("Среднее всех четных: %f\n", getAverage(evenNumbers));

        System.out.println("Массив нечетных чисел: " + oddNumbers);
        System.out.printf("Среднее всех нечетных: %f\n", getAverage(oddNumbers));
    }
}
