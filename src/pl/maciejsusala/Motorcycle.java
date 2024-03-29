package pl.maciejsusala;

import java.util.Objects;

public class Motorcycle extends PoweredVehicle implements Alarm {
    boolean isSportMotorcycle;
    double consumption;
    boolean isEngineOn;
    boolean isStopped = true;

    public Motorcycle(String make, String model, boolean isSportMotorcycle, double consumption, Engine engine) {
        this.make = make;
        this.model = model;
        this.isSportMotorcycle = isSportMotorcycle;
        this.consumption = consumption;
        this.engine = engine;
    }

    public Motorcycle(String make, String model, boolean isSportMotorcycle, double consumption, String type, FuelType fuelType) {
        this.make = make;
        this.model = model;
        this.isSportMotorcycle = isSportMotorcycle;
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
        if (isEngineOn && isStopped) {
            System.out.println("Silnik wyłączony");
            isEngineOn = false;
        } else if (isEngineOn) {
            System.out.println("Nie można wyłączyć silnika w trakcie jazdy!");
        } else {
            System.out.println("Bardziej już się nie da wyłączyć silnika");
        }
    }

    @Override
    public double getFuelConsumption(int kilometers) {
        return (this.consumption * kilometers) / 100;
    }

    @Override
    public void drive() {

        if (isStopped && isEngineOn) {
            System.out.println("Motocykl ruszył");
            isStopped = false;
        } else if (isStopped) {
            System.out.println("Najpierw włącz silnik");
        } else {
            System.out.println("Motocykl już jedzie");
        }
    }

    @Override
    public void stop() {
        if (isStopped) {
            System.out.println("Bardziej już się nie zatrzyma");
        } else {
            System.out.println("Motocykl stanął");
            isStopped = true;
        }
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "make='" + make + '\'' +
                ", name='" + model + '\'' +
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
        return isSportMotorcycle == that.isSportMotorcycle && Double.compare(consumption, that.consumption) == 0 && Objects.equals(make, that.make) && Objects.equals(model, that.model) && Objects.equals(engine, that.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, isSportMotorcycle, consumption, engine);
    }
}
