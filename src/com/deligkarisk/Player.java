package com.deligkarisk;

import java.util.ArrayList;

public class Player implements ISaveable {

    private String name;
    private int maxHealth;
    private int attackStrength;
    private int defenseStrength;

    public Player(String name, int maxHealth, int attackStrength, int defenseStrength) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.attackStrength = attackStrength;
        this.defenseStrength = defenseStrength;
    }

    public Player() {
    }

    @Override
    public ArrayList<String> convertToSaveable() {
        ArrayList<String> saveable = new ArrayList<>();
        saveable.add(name);
        saveable.add(Integer.toString(maxHealth));
        saveable.add(Integer.toString(attackStrength));
        saveable.add(Integer.toString(defenseStrength));
        return saveable;
    }

    @Override
    public void readFromSaveable(ArrayList<String> parameters) {
        this.name = parameters.get(0);
        this.maxHealth = Integer.valueOf(parameters.get(1));
        this.attackStrength = Integer.valueOf(parameters.get(2));
        this.defenseStrength = Integer.valueOf(parameters.get(3));

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", maxHealth=" + maxHealth +
                ", attackStrength=" + attackStrength +
                ", defenseStrength=" + defenseStrength +
                '}';
    }
}
