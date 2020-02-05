package AdapterMultipleVehicles;

import AdapterMultipleVehicles.Vehicles.*;

public class ExampleMultipleVehicles {

    public static void main(String[] args) {

        Vehicle triC = new Tricycle();
        Vehicle car = new Car();
        Vehicle superfBike = new SuperFastBicycle();
        Vehicle tandem = new TandemVehicle();

        McGyver mcGyver = new McGyver(new DrivingSkillAdapter(superfBike));


        /**Driving**/

        //FastBike
        mcGyver.ride();
        mcGyver.brake();

        //Tricycle
        mcGyver.changeBike(triC);
        mcGyver.ride();
        mcGyver.brake();

        //Car
        mcGyver.changeBike(car);
        mcGyver.ride();
        mcGyver.brake();

        //Car
        mcGyver.changeBike(tandem);
        mcGyver.ride();
        mcGyver.brake();


    }
}
