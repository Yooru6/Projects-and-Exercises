package com.template.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class RPSGame extends Game {
	
	//Parameters
	Map<Integer, String> recordMap;
	String choose;
	Scanner scan;
	int turns;
	
	
/* Implementation of necessary concrete methods */
void initializeGame() {
	System.out.println("Rock, Paper, Scissors!\n**********************");
	recordMap= new HashMap<Integer, String>();
	choose="";
	scan = new Scanner(System.in);
	turns=0;

}


void makePlay(int player) {	
	System.out.println("Player: "+(player+1));    
    System.out.println( "Rock = R,   Paper = P,  Scissors = S");
    
    //until input is valid
    while (!choose.equals("R") && !choose.equals("P") && !choose.equals("S")) {   
    	
        // Player input
        System.out.println("Choose: "); 
        choose = scan.next();

        //input to uppercase 
        choose = choose.toUpperCase();
        //input to recordmap
        recordMap.put(player, choose);
        System.out.println("\n-----------------\n");
        

        if (!choose.equals("R") && !choose.equals("P") && !choose.equals("S"))
            System.out.println("Invalid input. Try again.");

    }
    turns++;
    choose="";
    // Process one turn of player
}
boolean endOfGame() {
	if (turns==2) {
		
		// Return true if game is over 
		return true;
	}
	return false;
 
}
void printWinner() {
	// Display who won
	if (recordMap.get(0).equals(recordMap.get(1))) {
		   System.out.println("It's a tie!");
		}
	else if (recordMap.get(0).equals(("R"))) {
		if (recordMap.get(1).equals("S")) { 
			System.out.println("Rock crushes scissors. Player 1 WIN!!");}
		else if (recordMap.get(1).equals("P")) { 
			System.out.println("Paper eats rock. Player 2 WIN!!");}
		}
		else if (recordMap.get(0).equals("P")) {
		   if (recordMap.get(1).equals("S")) { 
		       System.out.println("Scissor cuts paper. Player 2 WIN!!");} 
		   else if (recordMap.get(1).equals("R")) { 
		        System.out.println("Paper eats rock. Player 1 WIN!!");}
		} 
		else if (recordMap.get(0).equals("S")) {
		     if (recordMap.get(1).equals("P")) {
		         System.out.println("Scissor cuts paper. Player 1 WIN!!");} 
		     else if (recordMap.get(1).equals("R")) { 
		        System.out.println("Rock breaks scissors. Player 2 WIN!!");}
    
}else {
	System.out.println("Something went wrong");
}}

}