package com.ing.zoo.command;

import com.ing.zoo.animal.Animal;
import com.ing.zoo.food.LeavesFood;
import com.ing.zoo.food.type.Herbivoor;
import com.ing.zoo.food.type.Omnivoor;

public class GiveLeaves implements Command {
    Animal[] zoo;

    public GiveLeaves(Animal[] zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute(String[] input) {
        for(Animal animal: zoo){
            if(animal instanceof Herbivoor || animal instanceof Omnivoor){
                ((LeavesFood) animal).eatLeaves();
            }
        }
    }
}
