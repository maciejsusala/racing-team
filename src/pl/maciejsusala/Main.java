package pl.maciejsusala;

class Main {
    public static void main(String[] args) {
        Car car = new Car("FORD", "FIESTA", 3, 25.5, "R4", FuelType.gas);
        Motorcycle motorcycle = new Motorcycle("KTM", "DUKE", false, 7.5, "V2", FuelType.gas);
        Bicycle bicycle = new Bicycle("KROSS", "LEVEL", 21, false);

        PoweredVehicle[] poweredVehicles = new PoweredVehicle[] {car,motorcycle};
        RacingTeam racingTeam = new RacingTeam(poweredVehicles);

        System.out.println(racingTeam.canRace(500,165));


        System.out.println(PoweredVehicle.getHorsePower(5500, 450));

        car.turnAlarmOn(); //TODO - sprawdzić czy jest wyłączony alarm, żeby móc go włączyć
        motorcycle.turnAlarmOff(); //TODO - sprawdzić czy jest włączony alarm, żeby móc go wyłączyć

        System.out.println(car.engine.getDescription());
        System.out.println(motorcycle.engine.getDescription());

        car.start();
        car.stop();
        car.turnOff();
        car.drive();

        motorcycle.start();
        motorcycle.stop();
        motorcycle.turnOff();
        motorcycle.drive();

        bicycle.adjustGears(26);

    }
}