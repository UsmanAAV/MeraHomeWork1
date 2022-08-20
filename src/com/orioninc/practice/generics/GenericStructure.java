package com.orioninc.practice.generics;

public class GenericStructure <T>{
    T field;

    public T getField() {
        return field;
    }

    GenericStructure(T field) {
        this.field = field;
    }
}
