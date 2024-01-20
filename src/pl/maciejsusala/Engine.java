package pl.maciejsusala;

import java.util.Objects;

public class Engine {
    String type;
    FuelType fuel;

    public Engine(String type, FuelType fuel) {
        this.type = type;
        this.fuel = fuel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", fuel=" + fuel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(type, engine.type) && fuel == engine.fuel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, fuel);
    }

    public String getDescription() {
        return "Typ silnika: " + getType() + "\n Rodzaj paliwa: " + getFuel();
    }

    public void start() {
        System.out.println("Silnik robi pyr pyr pyr");
    }

    public void turnOFF() {
        System.out.println("Silnik wyłączony");
    }
}
