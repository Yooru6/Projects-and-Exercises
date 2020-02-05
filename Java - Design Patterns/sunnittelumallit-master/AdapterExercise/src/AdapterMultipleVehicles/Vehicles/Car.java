package AdapterMultipleVehicles.Vehicles;

public class Car implements Vehicle {
    @Override
    public void driveB() {
        System.out.println("PRUUUM PRUUM....'Deja Vu! I've just been in this place before!'");
    }

    @Override
    public void brakeB() {
        System.out.println("SCHREEEECH.......\n");

    }
}
