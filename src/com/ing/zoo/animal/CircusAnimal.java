package com.ing.zoo.animal;

public abstract class CircusAnimal extends Animal {
    public CircusAnimal(String name) {
        super(name);
    }

    public abstract void performTrick();
}
