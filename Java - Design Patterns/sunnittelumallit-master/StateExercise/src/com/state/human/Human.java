package com.state.human;

import java.util.Random;

public class Human {
    private HumanState stateChild, stateAdult, stateSenior, currentState;
    private String characterName;
    Random r = new Random();
    
    public Human(String name){
    	this.characterName=name;
        stateChild = new StateChild();
        stateAdult = new StateAdult();
        stateSenior = new StateSenior();
        currentState = stateChild; 
    }
    
    public void selectState(HumanState state) {
    	if(state!=currentState) {
        this.currentState = state;
        System.out.println(characterName+"'s state has changed to: "+state.stateName+"\n\n\n");
    	}else {
    		System.out.println("You're already in that state");
    	}
    }
    
    public void printStats() {
    	System.out.println("*************************************");
    	System.out.println("State: "+currentState.stateName);
        System.out.println("Attack : "+currentState.getAttack()+"\tDefense: "+currentState.getDefense());
        System.out.println("Special attack: " + currentState.specialAttack);
        System.out.println("*************************************\n");
    }
    
    public void useSpecialAttack() {
        
    	int attackPWR = r.nextInt(((currentState.attackPts*3) - 1) + 1) + 1;
    	
    	System.out.println(currentState.stateName+" "+characterName+" uses special attack: "+currentState.specialAttack);
    	System.out.println("It deals "+attackPWR+" DMG!\n");
    }
    
    public void useNormalAttack() {
    	System.out.println(currentState.stateName+" "+characterName+" uses attack");
    	System.out.println("It deals "+currentState.attackPts+"!");
    }
    
    
    public HumanState getChildState() { return this.stateChild; } 
    public HumanState getAdultState() { return this.stateAdult; } 
    public HumanState getSeniorState() { return this.stateSenior; }    
    
}