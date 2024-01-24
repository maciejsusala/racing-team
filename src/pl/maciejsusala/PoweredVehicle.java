package pl.maciejsusala;

public abstract class PoweredVehicle extends Vehicle {

    Engine engine;
    public abstract void start();

    public abstract void turnOff();

    public abstract double getFuelConsumption(int kilometers);

    public static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }

    public abstract void drive();
}
