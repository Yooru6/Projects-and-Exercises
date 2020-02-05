package Robot;

public class Robot_NPSaveCloseCommand implements Command {
private JavaRobot light;
public Robot_NPSaveCloseCommand(JavaRobot light) {
this.light = light;
}

@Override // Command
public void execute() {
	light.writeHello();
	light.CloseAndSaveNP();
}
}
