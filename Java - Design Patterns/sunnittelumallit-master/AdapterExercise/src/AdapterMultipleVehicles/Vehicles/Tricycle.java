package AdapterMultipleVehicles.Vehicles;

public class Tricycle implements Vehicle {
    @Override
    public void driveB() {
        System.out.println("You are pedaling Tricyle but it feels like you are not moving at all");
    }

    @Override
    public void brakeB() {
        System.out.println("There is no need to slow down since you'are not moving\n");
    }
}
