package com.javaCarRace.classes.vehicles;

import com.javaCarRace.classes.Race;
import com.javaCarRace.classes.Reader;

import java.util.List;

public class Car extends Vehicle {


    public Car(int vehicleNumber, Race race) {
        super(vehicleNumber, race);
        setName();
    }

    @Override
    public float getDistanceTraveled() {
        return distanceTraveled;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName() {
        String carNamesFile = "/home/szniemiec/IdeaProjects/javaCarRace/src/textFiles/carNames.txt";
        Reader reader = new Reader();
        List<String> names = reader.reading(carNamesFile);
        this.name = names.get(vehicleNumber);
    }

    @Override
    public void setSpeed() {
        if (race.isThereABrokenTruck()) {
            this.speed = (float) (Math.random() * 75 + 0);
        } else {
            this.speed = (float) (Math.random() * 110 + 80);
        }
    }

    @Override
    public void prepareForLap() {
        setSpeed();
    }

    @Override
    public void moveForAnHour() {
        this.distanceTraveled += this.speed;
    }
}
