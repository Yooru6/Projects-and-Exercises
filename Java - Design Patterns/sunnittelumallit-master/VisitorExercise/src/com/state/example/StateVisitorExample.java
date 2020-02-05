package com.state.example;

import com.state.human.Human;

public class StateVisitorExample {
    public static void main(String[] args) {

        Human vayrynen = new Human("vayrynen");

        Simulation one = new Simulation(vayrynen);
        one.run();

        
    }
}