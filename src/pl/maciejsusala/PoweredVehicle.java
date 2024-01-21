package pl.maciejsusala;

public class PoweredVehicle extends Vehicle {
    public void start() {

    }

    public void turnOff() {

    }

    public double getFuelConsumption(int kilometers){
        return 0;
    }

    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
}
