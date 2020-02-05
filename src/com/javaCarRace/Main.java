package com.javaCarRace;

import com.javaCarRace.classes.Race;
import com.javaCarRace.classes.vehicles.Car;
import com.javaCarRace.classes.vehicles.Motorcycle;
import com.javaCarRace.classes.vehicles.Truck;

public class Main {


    public static void main(String[] args) {

	    Race race = new Race();
	    createVehicles(race);

	    race.simulateRace();
	    race.printRaceResults();
    }

    private static void createVehicles(Race race) {
        for (int i = 0; i < 10; i++) {
            race.addVehicle(new Car(i, race));
            race.addVehicle(new Motorcycle(i, race));
            race.addVehicle(new Truck(i, race));
        }
    }
}
