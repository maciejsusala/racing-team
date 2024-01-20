package pl.maciejsusala;

public class RacingTeam {
    PoweredVehicle[] poweredVehicles;

    public RacingTeam(PoweredVehicle[] poweredVehicles) {
        this.poweredVehicles = poweredVehicles;
    }

    public boolean canRace(int distance, double fuelAmount){
        double totalConsumption = 0;
        for (PoweredVehicle poweredVehicle : poweredVehicles) {
            totalConsumption += poweredVehicle.getFuelConsumption(distance);
        }
        return fuelAmount >= totalConsumption;
    }
}
