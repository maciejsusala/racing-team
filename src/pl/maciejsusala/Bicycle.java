package pl.maciejsusala;

import java.util.Objects;

public class Bicycle extends Vehicle {
    String make;
    String name;
    int numberOfGears;
    boolean hasBasket;

    public Bicycle(String make, String name, int numberOfGears, boolean hasBasket) {
        this.make = make;
        this.name = name;
        this.numberOfGears = numberOfGears;
        this.hasBasket = hasBasket;
    }


    @Override
    public void drive() {
        System.out.println("Rower jedzie");
    }

    @Override
    public void stop() {
        System.out.println("Rower stoi");
    }

    public void adjustGears(int newGears) {
        this.numberOfGears = newGears;
    }

    public void attachBasket() {
        this.hasBasket = true;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "make='" + make + '\'' +
                ", name='" + name + '\'' +
                ", numberOfGears=" + numberOfGears +
                ", hasBasket=" + hasBasket +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return numberOfGears == bicycle.numberOfGears && hasBasket == bicycle.hasBasket && Objects.equals(make, bicycle.make) && Objects.equals(name, bicycle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, name, numberOfGears, hasBasket);
    }
}
