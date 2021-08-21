package vehicles;

public class CarFactory {
    public static void main(String... args) {
        testCars();
//        BMWCar car = new BMWCar(4, 5, 500, 600, false, "M5");
//        BMWCar car2 = new BMWCar(2, 2, 250, 300, true, "Z4");
//
//        car.color = new Blue();
//        car.weight = 3000;
//
//        car2.color = new Red();
//        car2.weight = 5000;
//
//        car.move();
//        car.stop();

    }

    public static void testCars() {
        BMWX5 car1 = new BMWX5(true, Color.BLUE, 5);
        BMWX5 car2 = new BMWX5(false, Color.RED, 7);
        BMWX3 car3 = new BMWX3(true, Color.GREEN);
        AudiQ5 car4 = new AudiQ5(Color.AUDIBLUE);

        Vehicle[] arrayOfVehicles = new Vehicle[]{car1, car2, car3, car4};

        for (Vehicle car : arrayOfVehicles) {
            car.move();
            car.stop();
        }

        System.out.println("******************************************************");

        AbstractCar[] arrayOfCars = new AbstractCar[]{car1, car2, car3, car4};

        for (AbstractCar car : arrayOfCars) {
            System.out.println(car.carModel + ": " + car.passengerCapacity + ": " + car.color);
            car.move();
            car.stop();
        }

        for(VehicleWithWheels v : arrayOfCars) {
            System.out.println(v.numberOfWheels());
        }
    }
}
