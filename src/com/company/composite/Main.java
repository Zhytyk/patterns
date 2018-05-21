package com.company.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Element el1 = new SimpleElement(1);
        Element el2 = new SimpleElement(2);
        Element el3 = new SimpleElement(3);

        Element el4 = new CompositeElement(4, Arrays.asList(el1, el2, el3));

        Element el5 = new SimpleElement(5);

        Element main = new CompositeElement(0, Arrays.asList(el4, el5));

        main.printVal();
    }
}
