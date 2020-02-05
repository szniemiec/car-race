package com.javaCarRace.classes.vehicles;

import com.javaCarRace.classes.Race;

public abstract class Vehicle {

    String name;
    float speed;
    float distanceTraveled;
    int vehicleNumber;
    Race race;

    public Vehicle(int vehicleNumber, Race race) {
        this.vehicleNumber = vehicleNumber;
        this.distanceTraveled = 0;
        this.race = race;
    }

    public abstract float getDistanceTraveled();

    public abstract String getName();

    public abstract void setName();

    public abstract void setSpeed();

    public abstract void prepareForLap();

    public abstract void moveForAnHour();

}
