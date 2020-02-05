package DigitalClock;
import java.util.Observable;
import java.util.Observer;


// Observer class

class ClickerClock implements Observer {
	
private int clicks=1;



@Override
public void update(Observable arg0, Object arg1) {
	
	System.out.println(clicks);
	clicks++;
	
}
}