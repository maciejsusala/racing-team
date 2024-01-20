package pl.maciejsusala;

public interface PoweredVehicle extends Vehicle {
    void start();

    void turnOff();

    double getFuelConsumption(int kilometers);

    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
}
