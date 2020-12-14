package com.ing.zoo.animal;

import com.ing.zoo.food.type.Carnivoor;

public class Dog extends CircusAnimal implements Carnivoor {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Woof!");
    }

    @Override
    public void performTrick() {
        System.out.println("Lays down on to the floor");
    }

    @Override
    public void eatMeat() {
        System.out.println("nom spils out of tray");
    }
}
