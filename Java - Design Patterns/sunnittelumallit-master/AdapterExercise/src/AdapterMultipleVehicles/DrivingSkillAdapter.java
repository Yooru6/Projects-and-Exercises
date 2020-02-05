package AdapterMultipleVehicles;

import AdapterMultipleVehicles.Vehicles.Vehicle;

public class DrivingSkillAdapter implements VehicleAdapterIF {


    private Vehicle vehicle;

    public DrivingSkillAdapter(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    @Override
    public void changeVehicle(Vehicle newVehicle) {
        this.vehicle = newVehicle;
    }

    @Override
    public void pedal() {
        vehicle.driveB();
    }

    @Override
    public void brake() {
        vehicle.brakeB();
    }
}