package pl.maciejsusala;

import java.util.Objects;

public class Motorcycle implements PoweredVehicle, Alarm {
    String make;
    String name;
    boolean isSportMotorcycle;
    double consumption;
    Engine engine;
    boolean isEngineOn;
    boolean isStopped = true;

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
            if(isStopped){
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
                System.out.println("Motocykl ruszył");
                isStopped = false;
            } else {
                System.out.println("Najpierw włącz silnik!");
            }
        } else {
            System.out.println(isEngineOn ? "Motocykl już jedzie" : "Najpierw włącz silnik!");
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
