package com.state.human;

public abstract class HumanState {
    protected int hapinessPts;
    protected int anxietyPts;
    protected String[] specialEvent;
    protected String stateName;
    protected int days;
    protected int age;

 
 
public HumanState(){
  this.hapinessPts = 0;
  this.anxietyPts = 0;
  this.days =0;
  this.age=0;
 }


public int gethapinessPts() {return this.hapinessPts; }
public int getAnxietyPts() {return this.anxietyPts; }
public int getDays() {return this.days; }
public int getAge() {return this.age; }
}
