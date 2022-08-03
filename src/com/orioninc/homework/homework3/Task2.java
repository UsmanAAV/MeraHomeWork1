package com.orioninc.homework.homework3;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(new SequentialRandom().getValue());
        System.out.println(new SequentialRandom().getValue());
        System.out.println(new SequentialRandom().getValue());
        SequentialRandom.resetRandom();
        System.out.println(new SequentialRandom().getValue());
        System.out.println(new SequentialRandom().getValue());
    }
}
