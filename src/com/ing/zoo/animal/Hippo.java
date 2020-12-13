package com.ing.zoo.animal;

import com.ing.zoo.food.type.Herbivoor;

public class Hippo implements Animal, Herbivoor {
    public String name;
    public String helloText;
    public String eatText;

    public Hippo()
    {
        super();
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
