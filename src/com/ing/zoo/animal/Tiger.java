package com.ing.zoo.animal;

import com.ing.zoo.food.type.Carnivoor;

import java.util.Random;

public class Tiger implements CircusAnimal, Carnivoor {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Tiger(String name)
    {
        this.name = name;
    }

    public void sayHello()
    {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
