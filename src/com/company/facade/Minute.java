package com.company.facade;

public class Minute extends Base {
    public Minute(int value) {
        setValue(value);
    }

    @Override
    public void tick() {
        increment();

        if (getCounter() == 60) {
            setValue((getValue() + 1) % 60);
        }
    }

    public void print() {
        System.out.print(":" + getValue());
    }
}
