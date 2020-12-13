package com.ing.zoo.animal;

import com.ing.zoo.food.type.Carnivoor;

public class Lion extends Animal implements Carnivoor {
    public String helloText;
    public String eatText;

    public Lion(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
