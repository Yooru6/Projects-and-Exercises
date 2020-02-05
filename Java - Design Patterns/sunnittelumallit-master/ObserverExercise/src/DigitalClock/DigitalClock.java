package DigitalClock;
import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;

// Observer class

class DigitalClock implements Observer{
	

	public String getTime() {
	String time = "";

	Calendar cal = Calendar.getInstance();  
	int h = cal.get(Calendar.HOUR_OF_DAY);   
	int m = cal.get(Calendar.MINUTE);   
	int s = cal.get(Calendar.SECOND);   
	time += ((h < 10) ? "0" : "") + h + ":";
	time += ((m < 10) ? "0" : "") + m + ":";
	time += ((s < 10) ? "0" : "") + s;

	return time;
}

@Override
public void update(Observable arg0, Object arg1) {
	
	
	System.out.println(getTime());
	
}
}