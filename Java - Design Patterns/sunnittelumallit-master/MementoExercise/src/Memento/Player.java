package Memento;

import java.util.concurrent.ThreadLocalRandom;

public class Player extends Thread implements Runnable {
    private Riddler riddler;
    private String name;
    private int loops;

    public Player(Riddler riddler,String name) {
        this.name=name;
        this.riddler = riddler;
    }

    public String getfName() {
        return name;
    }

    public int getLoops() {
        return loops;
    }

    @Override
    synchronized public void run() {
        Memento memento = (Memento) riddler.joinGame(this);
        boolean correct;
        int guess = 0;

        //Start Guessing
        try {
            do {
                guess = ThreadLocalRandom.current().nextInt(1, 10 + 1);;
                correct = riddler.checkAnswer(guess, memento);
                System.out.println(this.getfName() + " arvasi " + guess);

                loops++;
                Thread.sleep(10);
            } while(!correct);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(this.getfName()+"'s GUESS " + guess +" WAS CORRECT!!! Xe had to try "+ this.getLoops()+" Times!");
    }

}
