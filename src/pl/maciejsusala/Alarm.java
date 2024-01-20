package pl.maciejsusala;

public interface Alarm {
    default void turnAlarmOn() {
        System.out.println("Włączył się alarm " + alarmSound);
    }

    default void turnAlarmOff() {
        System.out.println("Wyłączył się alarm");
    }

    String alarmSound = "ŁeeeŁooooŁeeeeeŁoooo!";
}
