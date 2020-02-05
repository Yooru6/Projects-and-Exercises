package Adapter;

public class SpandexGuy {
    private VehicleAdapter vehicleAdapter;

    public SpandexGuy(VehicleAdapter vehicleAdapter) {
        this.vehicleAdapter = vehicleAdapter;
    }

    public SpandexGuy() {
    }


    public void ride() {
        vehicleAdapter.pedal();
    }
    public void brake() { vehicleAdapter.brake();
    }
}