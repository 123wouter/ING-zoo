package com.ing.zoo.command;

import com.ing.zoo.animal.Animal;

public class CommandHandler {
    Hello hello;
    GiveMeat giveMeat;
    GiveLeaves giveLeaves;
    PerformTrick performTrick;

    public CommandHandler(Animal[] zoo) {
        // Create all commands
        this.hello = new Hello(zoo);
        this.giveMeat = new GiveMeat(zoo);
        this.giveLeaves = new GiveLeaves(zoo);
        this.performTrick = new PerformTrick(zoo);
    }

    public void command(String command){
        String[] inputParameters = command.split(" ", 2);

        if(inputParameters[0].equals("hello")){
            hello.execute(inputParameters);
        }
        else if(command.equals("give leaves")){
            giveLeaves.execute(inputParameters);
        }
        else if(command.equals("give meat")){
            giveMeat.execute(inputParameters);
        }
        else if(command.equals("perform trick")){
            performTrick.execute(inputParameters);
        }
        else {
            System.out.println("Unknown command: " + command);
        }
    }
}
