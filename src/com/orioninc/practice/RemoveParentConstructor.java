package com.orioninc.practice;

class Ape {
    int age;
    final int tailLength;

    Ape() {
        this.age = 0;
        this.tailLength = 0;
    }
    protected Ape(int age, int tailLength) {
        this.age = age;
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "Ape{" +
                "age=" + age +
                ", tailLength=" + tailLength +
                '}';
    }
}

class Human extends Ape {
    Human(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                '}';
    }
}

public class RemoveParentConstructor {
    public static void main(String[] args) {
        Ape ape = new Ape(4, 10);

        System.out.println(ape);

        Human human = new Human(33);
        System.out.println(human);

        // Human human2 = new Human(12, 22); не можем создать Human с хвостом
        Ape human2 = new Human(12);
        System.out.println(human2);
    }
}
