package com.group5.client;

import com.group5.character.Player;
import com.group5.gameSetup.GameSetup;
import com.group5.gameSetup.Instruction;
import com.group5.items.Items;

import java.util.Scanner;


public class Game {
    public void play() throws InterruptedException {
        Instruction instruction = new Instruction();
        instruction.showInstruction();

        GameSetup gameSetup = new GameSetup();
        Player soulStepper = new Player("SoulStepper", 100);
        Scanner scanner = new Scanner(System.in);
        Items item = new Items();
        while (true) {
            System.out.println("You are now at " + gameSetup.currentLocation.getName());

            System.out.println("\033[1;35m");
            System.out.println("Where would you like to go? ");
            System.out.println("\033[0m");
            System.out.print("> ");

            System.out.println();
            soulStepper.showInventory();

            if (gameSetup.currentLocation.items.size() > 0) {
                gameSetup.currentLocation.getItems();
            }
            String choice = scanner.nextLine().toLowerCase();
            String[] arrayChoice = choice.split(" ", 2);
            switch (arrayChoice[0]) {
                case "look":
                    gameSetup.look(gameSetup.currentLocation, arrayChoice[1]);
                    break;

                case "go":
                    gameSetup.go(gameSetup.currentLocation, arrayChoice[1]);
                    if (gameSetup.currentLocation.enemies.size() > 0) {
                        if (gameSetup.currentLocation.enemies.contains(gameSetup.boss)){
                            soulStepper.bossDance(gameSetup.currentLocation.enemies.get(0), soulStepper);
                            gameSetup.currentLocation.enemies.remove(0);
                        }
                        soulStepper.dance(gameSetup.currentLocation.enemies.get(0), soulStepper);
                        gameSetup.currentLocation.enemies.remove(0);
                    }
                    break;

                case "quit":

                case "exit":
                    System.out.println("Thanks for playing Soul Stepper");
                    return;

                case "get":
                    if (gameSetup.currentLocation.items.contains(arrayChoice[1])) {
                        gameSetup.removeItem(arrayChoice[1]);
                        soulStepper.addItem(arrayChoice[1]);
                    } else {
                        System.out.println("You can't do that");
                    }
                    break;
                case "use":
                    if (soulStepper.inventory.contains(arrayChoice[1])) {
                        soulStepper.removeItem(arrayChoice[1]);
                        item.useItem(arrayChoice[1], soulStepper);
                    }
                    break;

                default:
                    System.out.println("Invalid Command");
            }
        }


    }


}