package AdapterMultipleVehicles;

import AdapterMultipleVehicles.Vehicles.Vehicle;

public interface VehicleAdapterIF {
    void changeVehicle(Vehicle Vehicle);
    void pedal();
    void brake();
}

