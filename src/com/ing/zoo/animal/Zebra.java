package com.ing.zoo.animal;

import com.ing.zoo.food.type.Herbivoor;

public class Zebra extends Animal implements Herbivoor {
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
