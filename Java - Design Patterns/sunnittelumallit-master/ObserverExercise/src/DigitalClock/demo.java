package DigitalClock;

public class demo {
	
    public static void main(String args[]) throws InterruptedException {
        DigitalClock digitalClock = new DigitalClock();
        ClickerClock clickerClock = new ClickerClock();
       
        //for digital
        ClockTimer clocktimer = new ClockTimer();
        //for clicker
        ClockTimer clocktimer2 = new ClockTimer();
        
        
        // register with observer        
        clocktimer.addObserver(digitalClock);
        clocktimer2.addObserver(clickerClock);

        System.out.println("Digital clock activated");       
        clocktimer2.schedule(5);
        
        System.out.println("Clicker clock activated"); 
        clocktimer.schedule(1);
        
        
        Thread.sleep(10000*10);

        clocktimer.stop();
        clocktimer2.stop();
    }

}
