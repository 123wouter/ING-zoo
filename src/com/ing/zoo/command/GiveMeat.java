package com.ing.zoo.command;

import com.ing.zoo.animal.Animal;
import com.ing.zoo.food.MeatFood;
import com.ing.zoo.food.type.Carnivoor;
import com.ing.zoo.food.type.Omnivoor;

public class GiveMeat implements Command {
    Animal[] zoo;

    public GiveMeat(Animal[] zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute(String[] input) {
        for(Animal animal: zoo){
            if(animal instanceof Carnivoor || animal instanceof Omnivoor){
                ((MeatFood) animal).eatMeat();
            }
        }
    }
}
