package com.state.example;

import com.state.human.Human;

public class StateExample {
    public static void main(String[] args) {
        Human human = new Human("DragonSlayer");
        
         //Starting State child
        human.printStats();
        human.useSpecialAttack();
        
        //Change state to Adult
        human.selectState(human.getAdultState());
        human.printStats();
        human.useSpecialAttack();
        //
        
        //Change state to Senior
        human.selectState(human.getSeniorState());
        human.printStats();
        human.useSpecialAttack();
        human.useNormalAttack();

        
    }
}