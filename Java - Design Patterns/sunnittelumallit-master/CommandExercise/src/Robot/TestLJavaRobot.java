package Robot;

public class TestLJavaRobot{
public static void main(String[] args){
JavaRobot robot = new JavaRobot();
Command robotON_NPOpen = new Robot_OnAndNPOpenCommand(robot);
Command Robot_NPSaveClose = new Robot_NPSaveCloseCommand(robot);
RobotButton button1 = new RobotButton(robotON_NPOpen);
RobotButton button2 = new RobotButton(Robot_NPSaveClose);
button1.push();
button2.push();
}
}
