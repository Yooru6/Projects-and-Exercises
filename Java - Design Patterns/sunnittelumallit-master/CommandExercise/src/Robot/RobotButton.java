package Robot;

public class RobotButton {
Command cmd;
public RobotButton(Command cmd){
this.cmd = cmd;
}
public void push() {
cmd.execute();
}

}
