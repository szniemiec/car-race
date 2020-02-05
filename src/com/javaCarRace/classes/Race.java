package com.javaCarRace.classes;

import com.javaCarRace.classes.vehicles.Truck;
import com.javaCarRace.classes.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Race {

    List<Vehicle> cars;
    public Weather weather;
    boolean isBroken;

    public Race() {
        cars = new ArrayList<>();
        weather = new Weather();
    }

    public void simulateRace() {
        for (int hour = 1; hour <= 50; hour++) {
            for (Vehicle vehicle : cars) {
                vehicle.prepareForLap();
                vehicle.moveForAnHour();
                weather.setRaining();
            }
        }
    }

    public void printRaceResults() {
        List<Float> results = new ArrayList<>();
        String[] podium = new String[3];
        for (Vehicle vehicle : cars) {
            results.add(vehicle.getDistanceTraveled());
        }
        Collections.sort(results, Collections.reverseOrder());
        for (int index = 0; index < 3; index++) {
            for (Vehicle vehicle : cars) {
                if (results.get(index) == vehicle.getDistanceTraveled()) {
                    podium[index] = (index + 1) + ". " + vehicle.getName() + " | " + vehicle.getDistanceTraveled() + "\n";
                    break;
                }
            }
        }
        for (String elem : podium) {
            System.out.print(elem);
        }
    }

    public void addVehicle(Vehicle vehicle) {
        cars.add(vehicle);
    }

    public boolean isThereABrokenTruck() {
        isBroken = false;
        for (Vehicle vehicle : cars) {
            if (vehicle instanceof Truck) {
                if (((Truck) vehicle).getBreakdownTurnsLeft() > 0) {
                    return isBroken = true;
                }
            }
        }
        return isBroken;
    }

    public Weather getWeather() {
        return weather;
    }

}
