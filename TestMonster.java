package com.teksystems_java_monster;

import com.teksystems_java_monster.monster_creation.FireMonster;
import com.teksystems_java_monster.monster_creation.Monster;
import com.teksystems_java_monster.monster_creation.StoneMonster;
import com.teksystems_java_monster.monster_creation.WaterMonster;

public class TestMonster {
    public static void main(String[] args) {


        Monster m1 = new FireMonster("r2u2");
        Monster m2 = new WaterMonster("u2r2");
        Monster m3 = new StoneMonster("r2r2");

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        m1 = new StoneMonster("a2b2");
        System.out.println(m1.attack());

        Monster m4 = new Monster ("u2u2");
        System.out.println(m4.attack());

    } // end TestMonster method





} // end TestMonster Class
