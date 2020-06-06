package com.exampleinheritancetest;

import inheritance.monster.Monster;
import inheritance.monster.Skeleton;
import inheritance.monster.Zombie;

public class InheritanceTwo {
    public static void main(String[] args) {

        Monster monster = new Monster(10, 100);
        System.out.println(monster.speedMove);

        Skeleton skeleton = new Skeleton(20, 50, "gun");
        System.out.println(skeleton.speedMove);

        Zombie zombie = new Zombie();
    }
}
