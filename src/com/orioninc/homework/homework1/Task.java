package com.orioninc.homework.homework1;

import java.util.Scanner;

//1.	Скачать и настроить JDK
//        2.	Написать программу, в которой есть две переменные типа Integer со значениями. Значения можно указать в коде программы или ввести с клавиатуры или взять из аргументов.
//        3.	Если первое число больше второго – написать на экран «Число %s больше %s».
//        4.	Если первое число меньше второго – написать на экран «Число %s меньше %s».
//        5.	В любом случае, вывести на экран сумму чисел.

public class Task {

    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner console = new Scanner(System.in);

        System.out.print("Enter 1st number ");
        number1 = console.nextInt();

        System.out.print("Enter 2nd number ");
        number2 = console.nextInt();

        System.out.println("Number " + number1 + (number1 > number2 ? " is greater than " : " is lesser than ") + "number " + number2);

        System.out.println(number1 + number2 + " is the sum of the numbers");
        System.out.println("The sum of the numbers is " + number1 + number2);
    }
}
