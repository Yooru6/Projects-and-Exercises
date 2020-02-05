package Robot;

public class Robot_OnAndNPOpenCommand implements Command {
	private JavaRobot light;
	public Robot_OnAndNPOpenCommand(JavaRobot light) {
			this.light = light;
		}
	@Override // Command
	public void execute() {
		light.StartRobot();
		light.openNP();
	}
}
