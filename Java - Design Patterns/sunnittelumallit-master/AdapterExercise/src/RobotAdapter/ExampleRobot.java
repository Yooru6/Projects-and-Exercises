package RobotAdapter;

public class ExampleRobot {
    public static void main(String[] args) {

        Robot robot = new Robot();

        //Do stuff
        robot.setAdapter(new LaserCannonAdapter());
        robot.EquipWeapon();
        robot.setAdapter(new RocketLauncher());
        robot.EquipWeapon();

    }

}
