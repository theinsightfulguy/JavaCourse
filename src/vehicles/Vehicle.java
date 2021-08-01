package vehicles;

public interface Vehicle {
    void move();
    void stop();
}

interface VehicleWithWheels extends Vehicle{
    int numberOfWheels();
}

interface VehicleWithEngine extends Vehicle{
    int horsePower(); //TODO: Not very well encapsulated
    int torque();
}

interface VehicleWithTransmission extends Vehicle{
    boolean isAutomatic();
}

interface LandVehicle extends Vehicle{

}

abstract class Car implements VehicleWithEngine, VehicleWithTransmission, LandVehicle , VehicleWithWheels{
    Color color;
    double weight;
    final int numDoors;
    final int passengerCapacity;
    final String carModel;

    public Car(final int numDoors, final int passengerCapacity, String carModel) {
        this.numDoors = numDoors;
        this.passengerCapacity = passengerCapacity;
        this.carModel = carModel;
    }

    public abstract void setColor(Color c);

    public abstract void setWeight(double weight);
}

class BMWCar extends Car {

    private final int horsePower;
    private final int torque;
    private final boolean automatic;

    public BMWCar(int numDoors, int passengerCapacity, int horsePower, int torque, boolean automatic, String carModel) {
        super(numDoors, passengerCapacity, carModel);
        this.horsePower = horsePower;
        this.torque = torque;
        this.automatic = automatic;
    }

    @Override
    public void setColor(Color c) {
        this.color = c;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void move() {
        System.out.println("vroooom");
    }

    @Override
    public void stop() {
        System.out.println("screeeech");
    }

    @Override
    public int horsePower() {
        return horsePower;
    }

    @Override
    public int torque() {
        return torque;
    }

    @Override
    public boolean isAutomatic() {
        return automatic;
    }

    @Override
    public int numberOfWheels() {
        return 4;
    }
}

interface Color {
}

//TODO: Why do I need to instantiate new Colors? Can I have a single Color Instance?
final class Violet implements Color {

}

final class Indigo implements Color {

}

final class Blue implements Color {

}

final class Green implements Color {

}

final class Yellow implements Color {

}

final class Orange implements Color {

}

final class Red implements Color {

}
