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
        System.out.println();

        car.turnOff();
        car.start();
        car.start();
        car.turnOff();
        car.turnOff();
        System.out.println();

        car.drive();
        car.start();
        car.drive();
        car.drive();
        car.drive();
        car.turnOff();
        car.stop();
        car.turnOff();
        System.out.println();

        motorcycle.turnOff();
        motorcycle.start();
        motorcycle.start();
        motorcycle.turnOff();
        motorcycle.turnOff();
        System.out.println();

        motorcycle.drive();
        motorcycle.start();
        motorcycle.drive();
        motorcycle.drive();
        motorcycle.drive();
        motorcycle.turnOff();
        motorcycle.stop();
        motorcycle.turnOff();
        System.out.println();

        System.out.println(bicycle);
        bicycle.adjustGears(26);
        System.out.println(bicycle);

        bicycle.attachBasket();

        System.out.println(bicycle);
    }
}