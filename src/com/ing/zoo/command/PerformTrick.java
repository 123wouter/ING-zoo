package com.ing.zoo.command;

import com.ing.zoo.animal.Animal;
import com.ing.zoo.animal.CircusAnimal;

public class PerformTrick implements Command {
    Animal[] zoo;

    public PerformTrick(Animal[] zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute(String[] input) {
        for(Animal animal: zoo){
            if(animal instanceof CircusAnimal){
                ((CircusAnimal) animal).performTrick();
            }
        }
    }
}
