package com.orioninc.homework.task2;

//Задание 1. Случайности складываются
//        - Создать массив на 10 чисел типа int
//        - Заполнить массив случайными числами, используя класс Random и функцию nextInt()
//        - Вывести массив на экран одной строкой, разделив элементы пробелом
//        - Посчитать сумму всех элементов и вывести на экран
//        - Найти минимальный элемент и вывести на экран его индекс в массиве и значение

public class Task1 {

    public static void main(String[] args) {
        final int arraySize = 10;
        RandomArray array = new RandomArray(arraySize);

        System.out.println("array: " + array);
        System.out.println("sum of array elements: " + array.getSum());
        System.out.println("min element index: " + array.getMinElementIndex() + ", min element value: " + array.getMinElement());
    }
}
