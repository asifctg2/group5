package com.group5.client;

import com.group5.character.Player;
import com.group5.gameSetup.GameSetup;
import com.group5.gameSetup.Instruction;
import com.group5.items.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class Game {

    // Array lists that allow the use to use different synonyms while playing the game.

    ArrayList<String> look = new ArrayList<>(Arrays.asList("look", "glance", "peep", "peek", "see", "view"));
    ArrayList<String> go = new ArrayList<>(Arrays.asList("go", "move", "proceed", "advance", "progress", "pass", "walk"));
    ArrayList<String> quit = new ArrayList<>(Arrays.asList("quit", "exit"));
    ArrayList<String> get = new ArrayList<>(Arrays.asList("get", "acquire", "obtain", "receive", "gain", "grab", "pick up", "take", "pull", "draw"));
    ArrayList<String> use = new ArrayList<>(Arrays.asList("use", "utilize", "operate"));
    ArrayList<String> view = new ArrayList<>(Arrays.asList("check", "current"));

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
            System.out.println();
            soulStepper.showInventory();
            System.out.println();

            System.out.println();
            soulStepper.showInventory();
            System.out.println();
            System.out.print("\033[1;35m");
            System.out.println("Where would you like to go? ");
            System.out.print("\033[0m");
            System.out.println();
            System.out.print("> ");



            if (gameSetup.currentLocation.items.size() > 0) {
                gameSetup.currentLocation.getItems();
            }
            String choice = scanner.nextLine().toLowerCase();
            String[] arrayChoice = choice.split(" ", 2);
            if (look.contains(arrayChoice[0])) {
                gameSetup.look(gameSetup.currentLocation, arrayChoice[1]);
            } else if (go.contains(arrayChoice[0])) {
                gameSetup.go(gameSetup.currentLocation, arrayChoice[1]);
                if (gameSetup.currentLocation.enemies.size() > 0) {
                    if (gameSetup.currentLocation.enemies.contains(gameSetup.boss)) {
                        soulStepper.bossDance(gameSetup.currentLocation.enemies.get(0), soulStepper);
                        gameSetup.currentLocation.enemies.remove(0);
                    }
                    soulStepper.dance(gameSetup.currentLocation.enemies.get(0), soulStepper);
                    gameSetup.currentLocation.enemies.remove(0);
                }
            } else if (quit.contains(arrayChoice[0])) {
                System.out.println("Thanks for playing Soul Stepper");
                System.exit(0);
            } else if (get.contains(arrayChoice[0])) {
                if (gameSetup.currentLocation.items.contains(arrayChoice[1])) {
                    gameSetup.removeItem(arrayChoice[1]);
                    soulStepper.addItem(arrayChoice[1]);
                } else {
                    System.out.println("You can't do that");
                }
            } else if (use.contains(arrayChoice[0])) {
                if (soulStepper.inventory.contains(arrayChoice[1])) {
                    soulStepper.removeItem(arrayChoice[1]);
                    item.useItem(arrayChoice[1], soulStepper);
                }

            } else if (view.contains(arrayChoice[0])) {
                switch (arrayChoice[1]) {
                    case "health":
                        soulStepper.currentHealth();
                        System.out.println();
                    case "map":

                }

            } else{
                    System.out.println("Invalid Command");
                }
            }


        }


    }