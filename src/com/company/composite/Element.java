package com.company.composite;

public abstract class Element {
    private int value;

    public Element(int value) {
        this.value = value;
    }

    public void printVal() {
        System.out.println("Value: " + value + " ");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
