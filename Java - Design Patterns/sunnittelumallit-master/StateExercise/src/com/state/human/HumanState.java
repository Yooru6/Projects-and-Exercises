package com.state.human;

public abstract class HumanState {
protected int attackPts;
 protected int defensePts;
 protected String specialAttack;
 protected String stateName;
 
 protected int movementSpeed;
 
 
public HumanState(){
  this.movementSpeed=0;
  this.attackPts = 0;
  this.defensePts = 0;  
 }


public int getAttack () {return this.attackPts; }
public int getDefense() {return this.defensePts; }
public String getSpecialAttack () {return this.specialAttack; }
public int getMovement () {return this.movementSpeed; }
}
