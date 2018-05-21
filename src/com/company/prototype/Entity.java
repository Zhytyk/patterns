package com.company.prototype;

import java.util.concurrent.ThreadLocalRandom;

public class Entity implements Cloneable {
    private static Entity _instance = new Entity();

    public static Entity newInstance() throws CloneNotSupportedException {
        return (Entity) _instance.clone();
    }

    private int id;
    private String name;

    public Entity() {
        this.id = -1;
        this.name = "Default";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object entity = super.clone();
        ((Entity) entity).setId(Math.abs(ThreadLocalRandom.current().nextInt()));

        return entity;
    }
}
