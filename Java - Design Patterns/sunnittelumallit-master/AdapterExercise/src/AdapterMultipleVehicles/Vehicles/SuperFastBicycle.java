package AdapterMultipleVehicles.Vehicles;

public class SuperFastBicycle implements Vehicle {

    @Override
    public void driveB() {
        System.out.println("Bikes speed is breaking the sound fall!");
    }

    @Override
    public void brakeB() {
        System.out.println("Your speed is slowing down!\n");
    }
}