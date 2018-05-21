package com.company.adapter;

public class Main {
    public static void main(String[] args) {
        Entity entity = new Entity(1, "Pasha");
        EntityInterfaceApapter changedInterface = new EntityAdapter(entity);

        System.out.println(changedInterface.getFullData());
    }
}
