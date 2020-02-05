package AdapterMultipleVehicles.Vehicles;

public class TandemVehicle implements Vehicle {
    @Override
    public void driveB() {
        System.out.println("You can feel the wind on your face and breath of your friend on your back...");
    }

    @Override
    public void brakeB() {
        System.out.println("'One, Two...BRAAAKE!\n");
    }
}
