package com.ing.zoo;

import com.ing.zoo.animal.*;
import com.ing.zoo.food.LeavesFood;
import com.ing.zoo.food.MeatFood;
import com.ing.zoo.food.type.*;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Animal[] zoo = new Animal[7];

        zoo[0] = new Lion("henk");
        zoo[1] = new Hippo("elsa");
        zoo[2] = new Pig("dora");
        zoo[3] = new Tiger("wally");
        zoo[4] = new Zebra("marty");
        zoo[5] = new Dog("bella");
        zoo[6] = new Duck("zoe");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine().toLowerCase();

        //todo zet dit in een command handler?

        String[] inputParameters = input.split(" ");

        if(inputParameters[0].equals(commands[0])){
            if (inputParameters.length == 2){
                for(Animal animal: zoo){
                    if(animal.name.equals(inputParameters[1])){
                        animal.sayHello();
                    }
                }
            } 
            if (inputParameters.length == 1){
                for(Animal animal: zoo){
                    animal.sayHello();
                }
            }
        }
        else if(input.equals(commands[1])){
            for(Animal animal: zoo){
                if(animal instanceof Herbivoor || animal instanceof Omnivoor){
                    ((LeavesFood) animal).eatLeaves();
                }
            }
        }
        else if(input.equals(commands[2])){
            for(Animal animal: zoo){
                if(animal instanceof Carnivoor || animal instanceof Omnivoor){
                    ((MeatFood) animal).eatMeat();
                }
            }
        }
        else if(input.equals(commands[3])){
            for(Animal animal: zoo){
                if(animal instanceof CircusAnimal){
                    ((CircusAnimal) animal).performTrick();
                }
            }
        }
        else{
            System.out.println("Unknown command: " + input);
        }
    }
}
