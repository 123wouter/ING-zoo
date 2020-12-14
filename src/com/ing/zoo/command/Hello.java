package com.ing.zoo.command;

import com.ing.zoo.animal.Animal;

public class Hello implements Command {
    Animal[] zoo;

    public Hello(Animal[] zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute(String[] input) {
        for(Animal animal: zoo){
            if(input.length == 2){
                if(animal.name.equals(input[1])){
                    animal.sayHello();
                }
            } else{
                animal.sayHello();
            }
        }
    }
}
