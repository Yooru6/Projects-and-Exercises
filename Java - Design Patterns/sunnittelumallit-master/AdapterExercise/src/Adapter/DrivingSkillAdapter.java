package Adapter;

public class DrivingSkillAdapter implements VehicleAdapter {

    private SuperFastBike bicycle;

    public DrivingSkillAdapter() {
        bicycle = new SuperFastBike();
    }

    @Override
    public void pedal() {
        bicycle.pedalSuperFastBike();
    }

    @Override
    public void brake() {
        bicycle.brakeSuperFastBike();
    }
}