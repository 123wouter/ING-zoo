package com.ing.zoo.animal;

import com.ing.zoo.food.type.Herbivoor;

public class Duck extends Animal implements Herbivoor {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Quack quack quack");
    }

    @Override
    public void eatLeaves() {
        System.out.println("Nieamie");
    }
}
