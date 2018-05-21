package com.company.facade;

public class Second extends Base {

    public Second(int value) {
        setValue(value);
    }

    @Override
    public void tick() {
        increment();
        setValue((getValue() + 1) % 60);
    }

    public void print() {
        System.out.println(":" + getValue());
    }
}
