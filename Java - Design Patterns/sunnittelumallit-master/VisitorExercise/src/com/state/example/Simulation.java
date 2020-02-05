package com.state.example;

import com.state.human.Human;

import java.util.concurrent.ThreadLocalRandom;

public class Simulation implements Runnable {
    private Human human;

    public Simulation(Human human) {
        this.human = human;
    }



    @Override
    public void run() {
        int rand;
        boolean correct;
        //Start aging
        try {
            do {
                rand = ThreadLocalRandom.current().nextInt(1, 30 + 1);
                for(int i =0; i<=rand;i++) {
                    human.liveLife();
                }

                human.TriggerSpecialEvent();
                human.printStats();
                Thread.sleep(100);

                //Thread.sleep(10);
            } while(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //System.out.println();
    }

}

