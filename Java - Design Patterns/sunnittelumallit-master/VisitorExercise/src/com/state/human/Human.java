package com.state.human;

import com.state.Visitor.AgeVisitor;
import com.state.Visitor.VisitorIF;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Human {
    private HumanState stateChild, stateAdult, stateSenior, currentState;
    private String characterName;
    private int daysGoOn;
    int randmValue;

    private Random r = new Random();

    VisitorIF visitor;



    HumanState[] stateArray;
    
    public Human(String name){
    	this.characterName=name;
        stateChild = new StateChild();
        stateAdult = new StateAdult();
        stateSenior = new StateSenior();
        currentState = stateChild;

        //Visitorille
        stateArray = new HumanState[]{stateChild, stateAdult, stateSenior};
        visitor= new AgeVisitor(this);

    }
    
    public void selectState(HumanState state) {
    	if(state!=currentState) {
        this.currentState = state;
        System.out.println(characterName+"'s state has changed to: "+state.stateName+"\n\n\n");
    	}else {
    		System.out.println("You're already in that state");
    	}
    }

    public void stateUp() {
        if(currentState==stateArray[0]) {
            printSummary();
            this.currentState = getAdultState();
            System.out.println("\n"+characterName+"'s state has changed to: "+currentState.stateName+"\n\n\n");
        }else if (this.currentState==stateArray[1]){
            printSummary();
            this.currentState = getSeniorState();
            System.out.println("\n"+characterName+"'s state has changed to: "+currentState.stateName+"\n\n\n");
        }else{
            System.out.println("YOU ARE PROBABLY DEAD");
        }
    }
    
    public void printStats() {
    	System.out.println("\n***********CURRENT STATUS************");
    	System.out.println("State: "+currentState.stateName);
        System.out.println("Hapiness: "+currentState.gethapinessPts()+"\tAnxiety: "+currentState.getAnxietyPts());
        System.out.println("Age: "+currentState.getAge());
        System.out.println("*************************************\n");
    }
    public void printSummary() {
        System.out.println("xxxxxxxxxxx LIFE QUALITY xxxxxxxxxxx");

        System.out.println("Life quality while "+currentState.stateName+": "+ (currentState.gethapinessPts()-currentState.getAnxietyPts()));

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx*\n");

    }

    
    public void TriggerSpecialEvent() {
        randmValue = ThreadLocalRandom.current().nextInt(2);
        daysGoOn = ThreadLocalRandom.current().nextInt(30, 60);
        System.out.println("\n-------------------------------------------------------------");
    	System.out.println("-"+" Something special happens to "+currentState.stateName+" "+characterName+": "+currentState.specialEvent[randmValue]);
        System.out.println("-------------------------------------------------------------\n");

        randmValue = ThreadLocalRandom.current().nextInt(2);
        if(randmValue==1){
            currentState.anxietyPts+=(2*daysGoOn);
        }else{
            currentState.hapinessPts+=(2*daysGoOn);
        }

        currentState.days +=daysGoOn;
        visitor.Visit(this);
    }
    
    public void liveLife() {
        daysGoOn = ThreadLocalRandom.current().nextInt(15, 30);
        randmValue = ThreadLocalRandom.current().nextInt(2);
    	System.out.println("\n"+currentState.stateName+" "+characterName+" lives his life..");

        if(randmValue==1){
            currentState.anxietyPts+=(1*daysGoOn);
        }else{
            currentState.hapinessPts+=(1*daysGoOn);
        }

    	currentState.days +=daysGoOn;
    	visitor.Visit(this);
    }

    public void ageUp(){

        daysGoOn = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        currentState.age++;
        System.out.println("\n"+currentState.stateName+" "+characterName+" got older by a year and is now " + currentState.age + " year old!\n");
        printStats();

        this.currentState.days=0;

    }
    
    
    public HumanState getChildState() { return this.stateChild; } 
    public HumanState getAdultState() { return this.stateAdult; } 
    public HumanState getSeniorState() { return this.stateSenior; }

    public int getAge() { return currentState.getAge(); }
    public int getDays() { return currentState.getDays(); }

}