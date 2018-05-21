package com.company.facade;

public class Hour extends Base {

    public Hour(int value) {
        setValue(value);
    }

    @Override
    public void tick() {
        increment();

        if (getCounter() == 3600) {
            setValue((getValue() + 1) % 24);
        }
    }

    public void print() {
        System.out.print(getValue());
    }
}
