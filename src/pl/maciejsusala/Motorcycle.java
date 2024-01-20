package pl.maciejsusala;

import java.util.Objects;

public class Motorcycle implements PoweredVehicle, Alarm {
    String make;
    String name;
    boolean isSportMotorcycle;
    double consumption;
    Engine engine;

    public Motorcycle(String make, String name, boolean isSportMotorcycle, double consumption, Engine engine) {
        this.make = make;
        this.name = name;
        this.isSportMotorcycle = isSportMotorcycle;
        this.consumption = consumption;
        this.engine = engine;
    }

    public Motorcycle(String make, String name, boolean isSportMotorcycle, double consumption, String type, FuelType fuelType) {
        this.make = make;
        this.name = name;
        this.isSportMotorcycle = isSportMotorcycle;
        this.consumption = consumption;
        this.engine = new Engine(type, fuelType);
    }


    @Override
    public void start() {
        System.out.println("Silnik motocykla robi wrum!");//TODO coś ambitniejszego
    }

    @Override
    public void turnOff() {
        System.out.println("Silnik motocykla wyłączony");//TODO coś ambitniejszego
    }

    @Override
    public double getFuelConsumption(int kilometers) {
        return (this.consumption * kilometers) / 100;
    }

    @Override
    public void drive() {
        System.out.println("Motocykl jedzie");//TODO coś ambitniejszego
    }

    @Override
    public void stop() {
        System.out.println("Motocykl stoi");//TODO coś ambitniejszego
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "make='" + make + '\'' +
                ", name='" + name + '\'' +
                ", isSportMotorcycle=" + isSportMotorcycle +
                ", consumption=" + consumption +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorcycle that = (Motorcycle) o;
        return isSportMotorcycle == that.isSportMotorcycle && Double.compare(consumption, that.consumption) == 0 && Objects.equals(make, that.make) && Objects.equals(name, that.name) && Objects.equals(engine, that.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, name, isSportMotorcycle, consumption, engine);
    }
}
