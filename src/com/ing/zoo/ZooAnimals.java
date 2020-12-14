package com.ing.zoo;

import com.ing.zoo.animal.Animal;

import java.util.ArrayList;

public class ZooAnimals {
    private static ZooAnimals instance;
    private ArrayList<Animal> zooAnimals;

    public static ZooAnimals getInstance(){
        if(instance == null)
            instance = new ZooAnimals();

        return instance;
    }

    public void addAnimal(Animal animal){
        this.zooAnimals.add(animal);
    }

    public ArrayList<Animal> getZooAnimals(){
        return zooAnimals;
    }

}
