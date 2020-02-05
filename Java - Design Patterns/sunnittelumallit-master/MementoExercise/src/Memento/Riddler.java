package Memento;

import java.util.concurrent.ThreadLocalRandom;

public class Riddler {

    public Object joinGame(Player player) {
        int luku = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        return new Memento(luku);
    }

    public boolean checkAnswer(int guess, Memento memento) {
        if (memento.getGuess()==guess){
            return true;
        }else {
            return false;
        }

    }



}
