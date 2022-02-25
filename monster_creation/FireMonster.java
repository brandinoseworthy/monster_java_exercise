package com.teksystems_java_monster.monster_creation;

import com.teksystems_java_monster.monster_creation.Monster;

public class FireMonster extends Monster {

    // fields
    // constructors
    public FireMonster(String name) {
        super(name);
    }

    // constructors
    // methods
    @Override
    public String attack() {
        return "Attack with fire!";

    }
}
