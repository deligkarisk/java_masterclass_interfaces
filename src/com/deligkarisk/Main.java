package com.deligkarisk;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ISaveable player1 = new Player("Gladiator", 100, 12, 4);
        ISaveable monster1 = new Monster("Orgezombie", "Zombie", 120, 9, 3);

        saveSaveable(player1);
        saveSaveable(monster1);

        ISaveable player2 = new Player();
        restoreSaveable(player2);
        System.out.println(player2);


    }


    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    private static void saveSaveable(ISaveable saveableObject) {
        System.out.println(saveableObject.convertToSaveable());
    }

    private static void restoreSaveable(ISaveable saveableObject) {
        saveableObject.readFromSaveable(readValues());
    }
}
