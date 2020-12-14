package com.ing.zoo;

import com.ing.zoo.animal.*;
import com.ing.zoo.command.CommandHandler;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        Animal[] zoo = new Animal[7];
        zoo[0] = new Lion("henk");
        zoo[1] = new Hippo("elsa");
        zoo[2] = new Pig("dora");
        zoo[3] = new Tiger("wally");
        zoo[4] = new Zebra("marty");
        zoo[5] = new Dog("bella");
        zoo[6] = new Duck("zoe");

        // Creates all the commands
        CommandHandler commandHandler = new CommandHandler(zoo);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine().toLowerCase();
        commandHandler.command(input);
    }
}
