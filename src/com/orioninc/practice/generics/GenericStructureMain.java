package com.orioninc.practice.generics;

import java.util.ArrayList;

public class GenericStructureMain {
    public static void main(String[] args) {
        GenericStructure<Integer> structure1 = new GenericStructure<>(2);
        GenericStructure<String> structure2 = new GenericStructure<>("2");
        GenericStructure<Integer> structure3 = new GenericStructure<>(3);

        System.out.println(structure1);
        System.out.println(structure1.getField());
        System.out.println(structure1.getClass());
        System.out.printf("Is structure1 instance of GenericStructure? '%s'\n", structure1 instanceof GenericStructure ? "yes" : "no");
//        System.out.printf("Is structure1 instance of GenericStructure<Integer>? '%s'", structure1 instanceof GenericStructure<Integer> ? "yes" : "no");
        System.out.println(structure2);
        System.out.println(structure2.getField());
        System.out.println(structure2.getClass());
        System.out.println(structure3);
        System.out.println(structure3.getField());
        System.out.println(structure3.getClass());
    }
}
