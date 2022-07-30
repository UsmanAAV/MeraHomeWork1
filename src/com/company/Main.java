package com.company;

import java.util.Scanner;

public class Main {

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
