package com.exampleinheritancetest;

import inheritance.monster.Monster;
import inheritance.monster.Skeleton;
import inheritance.monster.Zombie;

public class InheritanceTwo {
    public static void main(String[] args) {

        Monster monster = new Skeleton(10, 100);
        monster.atack();

    }

    void method(Monster monster){
        
    }
}
