package com.company.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Entity en1 = Entity.newInstance();
        Entity en2 = Entity.newInstance();

        System.out.println("en1: " + en1.getId());
        System.out.println("en2: " + en2.getId());
    }
}
