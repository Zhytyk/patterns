package com.company.composite;

import java.util.List;

public class CompositeElement extends Element {
    private List<Element> elements;

    public CompositeElement(int value, List<Element> elements) {
        super(value);
        this.elements = elements;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    @Override
    public void printVal() {
        super.printVal();
        System.out.println(" --Childs: ");
        elements.forEach(Element::printVal);
        System.out.println(" --End: ");
    }
}
