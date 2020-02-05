package com.javaCarRace.classes.vehicles;

import com.javaCarRace.classes.Race;

public class Motorcycle extends Vehicle {

    public Motorcycle(int vehicleNumber, Race race) {
        super(vehicleNumber, race);
        setName();
    }

    @Override
    public void setName() {
        this.name = "Motorcycle " + vehicleNumber;
    }

    @Override
    public void setSpeed() {
        boolean isRaining = race.getWeather().getIsRaining();
        if (isRaining) {
            this.speed = (100 - (float)(Math.random() * 50 + 5));
        } else {
            this.speed = 100;
        }
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
    public void prepareForLap() {
        setSpeed();
    }

    @Override
    public void moveForAnHour() {
        this.distanceTraveled += this.speed;
    }
}
