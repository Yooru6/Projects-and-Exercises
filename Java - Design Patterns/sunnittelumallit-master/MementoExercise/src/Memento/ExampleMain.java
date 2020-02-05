package Memento;

import java.util.ArrayList;

public class ExampleMain {



    public static void main(String[] args) {
        Riddler arvuuttaja = new Riddler();

        ArrayList<Thread> playerit = new ArrayList<>();


        playerit.add(new Player(arvuuttaja,"Matti"));
        playerit.add(new Player(arvuuttaja,"Teppo"));
        playerit.add(new Player(arvuuttaja,"DRAGONSLAYER"));
        playerit.add(new Player(arvuuttaja,"Rainbow Dash"));
        playerit.add( new Player(arvuuttaja,"Naruto"));


        for(Thread p : playerit){
            p.start();

            try {

                p.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}

/**

 Thread matti = new Player(arvuuttaja,"Matti");
 Thread teppo = new Player(arvuuttaja,"Teppo");
 Thread dragonslayer = new Player(arvuuttaja,"DRAGONSLAYER");
 Thread rainbowDash = new Player(arvuuttaja,"Rainbow Dash");
 Thread naruto= new Player(arvuuttaja,"Naruto");

 **/