package com.deligkarisk;

import java.util.ArrayList;

public class Monster implements ISaveable {

    private String name;
    private String monsterClass;
    private int maxHealth;
    private int attackStrength;
    private int defenseStrength;




    public Monster(String name, String monsterClass, int maxHealth, int attackStrength, int defenseStrength) {
        this.name = name;
        this.monsterClass = monsterClass;
        this.maxHealth = maxHealth;
        this.attackStrength = attackStrength;
        this.defenseStrength = defenseStrength;
    }

    public Monster() {

    }

    @Override
    public ArrayList<String> convertToSaveable() {
        ArrayList<String> saveable = new ArrayList<>();
        saveable.add(name);
        saveable.add(monsterClass);
        saveable.add(Integer.toString(maxHealth));
        saveable.add(Integer.toString(attackStrength));
        saveable.add(Integer.toString(defenseStrength));
        return saveable;
    }

    @Override
    public void readFromSaveable(ArrayList<String> parameters) {
        this.name = parameters.get(0);
        this.name = parameters.get(1);
        this.maxHealth = Integer.valueOf(parameters.get(2));
        this.attackStrength = Integer.valueOf(parameters.get(3));
        this.defenseStrength = Integer.valueOf(parameters.get(4));

    }


}
