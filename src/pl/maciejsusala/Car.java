package pl.maciejsusala;

import java.util.Objects;

public class Car extends PoweredVehicle implements  Alarm {
    int numberOfDoors;
    double consumption;
    private boolean isEngineOn;
    private boolean isStopped = true;

    public Car(String make, String model, int numberOfDoors, double consumption, Engine engine) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.consumption = consumption;
        this.engine = engine;
    }

    public Car(String make, String model, int numberOfDoors, double consumption, String type, FuelType fuelType) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.consumption = consumption;
        this.engine = new Engine(type, fuelType);
    }

    @Override
    public void start() {
        if (isEngineOn) {
            System.out.println("Silnik bardziej już się nie włączy");
        } else {
            System.out.println("Silnik robi pyr pyr pyr");
            isEngineOn = true;
        }
    }

    @Override
    public void turnOff() {
        if (isEngineOn) {
            if (isStopped) {
                System.out.println("Silnik wyłączony");
                isEngineOn = false;
            } else {
                System.out.println("Nie można wyłączyć silnika w trakcie jazdy!");
            }
        } else {
            System.out.println("Bardziej się już nie da wyłączyć silnika");
        }
    }

    @Override
    public double getFuelConsumption(int kilometers) {
        return (this.consumption * kilometers) / 100;
    }

    @Override
    public void drive() {
        if (isStopped) {
            if (isEngineOn) {
                System.out.println("Samochód ruszył");
                isStopped = false;
            } else {
                System.out.println("Najpierw włącz silnik!");
            }
        } else {
            System.out.println(isEngineOn ? "Samaochód już jedzie" : "Najpierw włącz silnik!");
        }
    }

    @Override
    public void stop() {
        if (isStopped) {
            System.out.println("Bardziej już się nie zatrzyma");
        } else {
            System.out.println("Samochód stanął");
            isStopped = true;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", name='" + model + '\'' +
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
        return numberOfDoors == car.numberOfDoors && Double.compare(consumption, car.consumption) == 0 && Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, numberOfDoors, consumption, engine);
    }
}
