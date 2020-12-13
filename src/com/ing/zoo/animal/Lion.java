package com.ing.zoo.animal;

import com.ing.zoo.food.type.Carnivoor;

public class Lion implements Animal, Carnivoor {
    public String name;
    public String helloText;
    public String eatText;

    public Lion()
    {
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
