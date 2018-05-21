package com.company.decorator;

public class Main {
    public static void main(String[] args) {
        Entity entity = new Entity(1, "Paul");
        EntityDecorator decorator = new EntityDecorator("Pasha", entity);

        System.out.println("Id: " + decorator.getId());
        System.out.println("Name: " + decorator.getName());
        System.out.println("Alias: " + decorator.getAlias());
    }


}
