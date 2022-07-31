package com.orioninc.practice;

class BaseClass {
    static int field = 2;
    static int getField() {
        return field;
    }
}

class InheritedClass extends BaseClass {
    static int field = 3;
}

public class StaticInheritance {

    public static void main(String[] args) {
        System.out.println(InheritedClass.getField());
        System.out.println(InheritedClass.field);
    }
}
