package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class JavaRobot {
		
	Robot robot;
	
	Runtime run = Runtime.getRuntime();
		
	//StartRobot
	public void StartRobot(){
		try {
			robot=new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Robot is ready for use!");
	}
	
	//Open Notepad
	public void openNP(){
		String command = "notepad.exe";
		System.out.println("Opening notepad..");

		
		try { 
			run.exec(command);
			Thread.sleep(2000); 	
		} 
		catch (InterruptedException | IOException e) 
		{ 
	    // TODO Auto-generated catch block 
	    e.printStackTrace();
	    
	}
	}
		
	//Write Hello
	public void writeHello() {

        try {
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_H);
			robot.delay(100);
	        robot.keyPress(KeyEvent.VK_E); 
	        robot.delay(600); 
	        robot.keyPress(KeyEvent.VK_L); 
	        robot.delay(400); 
	        robot.keyPress(KeyEvent.VK_L); 
	        robot.delay(500);
	        robot.keyPress(KeyEvent.VK_O);
	        robot.delay(2000);
	        
	        
	        
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	
	
	//Close and save
	public void CloseAndSaveNP() {
		System.out.println("Saving and closing notepad...");
		try {
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);
			robot.delay(1000);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			robot.keyPress(KeyEvent.VK_P);
			robot.delay(200); 
	        robot.keyPress(KeyEvent.VK_R); 
	        robot.delay(200); 
	        robot.keyPress(KeyEvent.VK_A); 
	        robot.delay(600); 
	        robot.keyPress(KeyEvent.VK_N); 
	        robot.delay(500);
	        robot.keyPress(KeyEvent.VK_K);
	        
	        robot.delay(1000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.delay(100);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        robot.delay(2000);
	        robot.keyPress(KeyEvent.VK_Y);
	        
	        
			
			Runtime.getRuntime().exec("taskkill /IM notepad.exe");
			
			robot.delay(1000);


			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Notepad saved & closed");
	}
	

}
