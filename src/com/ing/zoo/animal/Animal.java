package com.ing.zoo.animal;

public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sayHello();
}
