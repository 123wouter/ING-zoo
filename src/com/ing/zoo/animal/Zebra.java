package com.ing.zoo.animal;

import com.ing.zoo.food.type.Herbivoor;

public class Zebra implements Animal, Herbivoor {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra(String name)
    {
        this.name = name;
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
