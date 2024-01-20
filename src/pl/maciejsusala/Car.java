package pl.maciejsusala;

import java.util.Objects;

public class Car implements PoweredVehicle, Alarm {
    String make;
    String name;
    int numberOfDoors;
    double consumption;
    Engine engine;

    public Car(String make, String name, int numberOfDoors, double consumption, Engine engine) {
        this.make = make;
        this.name = name;
        this.numberOfDoors = numberOfDoors;
        this.consumption = consumption;
        this.engine = engine;
    }

    public Car(String make, String name, int numberOfDoors, double consumption, String type, FuelType fuelType) {
        this.make = make;
        this.name = name;
        this.numberOfDoors = numberOfDoors;
        this.consumption = consumption;
        this.engine = new Engine(type, fuelType);
    }

    @Override
    public void start() {
        System.out.println("Silnik samochodu się włączył");//TODO jakaś ambitniejsza implementacja - spradzę czy włączony zanim włączę i zapiszę stan
    }

    @Override
    public void turnOff() {
        System.out.println("Silnik samochodu się wyłączył");//TODO jakaś ambitniejsza implementacja sprawdzę czy działa żeby wyłączyć
    }

    @Override
    public double getFuelConsumption(int kilometers) {
        return (this.consumption * kilometers) / 100;
    }

    @Override
    public void drive() {
        System.out.println("Samochód jedzie");//TODO jakaś ambitniejsza implementacja - jeśli silnik włączony to jedzie i wydaje dźwięk
    }

    @Override
    public void stop() {
        System.out.println("Samochód stoi");//TODO jakaś ambitniejsza implementacja - sprawdzę czy samochód już nie stoi bo bardziej nie może
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", name='" + name + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", consumption=" + consumption +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numberOfDoors == car.numberOfDoors && Double.compare(consumption, car.consumption) == 0 && Objects.equals(make, car.make) && Objects.equals(name, car.name) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, name, numberOfDoors, consumption, engine);
    }
}
