package com.ing.zoo;

import com.ing.zoo.animal.*;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Animal[] zoo = new Animal[5];

        zoo[0] = new Lion("henk");
        zoo[1] = new Hippo("elsa");
        zoo[2] = new Pig("dora");
        zoo[3] = new Tiger("wally");
        zoo[4] = new Zebra("marty");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        // todo functie die command en naam schijd
        if(input.equals(commands[0] + " henk"))
        {
            zoo[1].sayHello();
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
