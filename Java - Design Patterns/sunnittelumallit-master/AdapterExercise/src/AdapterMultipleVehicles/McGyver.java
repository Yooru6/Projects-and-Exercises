package AdapterMultipleVehicles;

import AdapterMultipleVehicles.Vehicles.Vehicle;

public class McGyver {
    private VehicleAdapterIF vehicleAdapterIF;

    public McGyver(VehicleAdapterIF vehicleAdapterIF) {
        this.vehicleAdapterIF = vehicleAdapterIF;
    }

    public McGyver() {
    }

    public void changeBike(Vehicle vehicle){
        vehicleAdapterIF.changeVehicle(vehicle);}
    public void ride() {
        vehicleAdapterIF.pedal();
    }
    public void brake() { vehicleAdapterIF.brake();
    }
}