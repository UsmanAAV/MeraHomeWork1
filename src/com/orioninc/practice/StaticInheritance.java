package com.orioninc.practice;

class BaseClass {
    static int field = 1;
    static int field2 = 2;
    static int getField() {
        return field;
    }
}

class InheritedClass extends BaseClass {
    static int field = 3;
}

public class StaticInheritance {

    public static void main(String[] args) {
        System.out.println(InheritedClass.getField()); // значение из BaseClass
        System.out.println(InheritedClass.field); // значение из InheritedClass
        System.out.println(InheritedClass.field2); // у класса наследника есть доступ к статик полям и методам родителя
    }
}
