package com.ing.zoo.animal;

import com.ing.zoo.food.type.Herbivoor;

public class Hippo extends Animal implements Herbivoor {
    public String helloText;
    public String eatText;

    public Hippo(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
