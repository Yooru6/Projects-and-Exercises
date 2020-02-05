package DigitalClock;
import java.util.Calendar;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

public class ClockTimer extends Observable {
    Timer timer;
    int seconds;
    
    


   // Notify task to notify observers
    //TimerTask task that can be scheduled for one-time or repeated execution by a Timer.
 class NotifyTask extends TimerTask{        
    	
        @Override
        public void run() {
        addSecond();	
        
    	setChanged();
    	notifyObservers();
        
        }
}
		 
    public ClockTimer( ) {
        timer = new Timer(); 
    }
    
    //Schedules how often Timertask is run
    public void schedule(long seconds){
        timer.scheduleAtFixedRate(new NotifyTask(), 0, seconds*1000); //delay in milliseconds
        
    }
    
    public int getSeconds() {
    	return seconds;
    }
    
    public void addSecond() {
    	seconds++;
    }

    public void stop(){
    timer.cancel();
    }
    
    
}