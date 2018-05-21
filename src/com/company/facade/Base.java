package com.company.facade;

public abstract class Base {
    private int value;
    private int counter;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }

    public abstract void tick();
}
