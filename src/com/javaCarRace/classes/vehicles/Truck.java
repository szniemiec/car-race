package com.javaCarRace.classes.vehicles;

import com.javaCarRace.classes.Race;

public class Truck extends Vehicle {

    private int breakdownTurnsLeft;

    public Truck(int vehicleNumber, Race race) {
        super(vehicleNumber, race);
        setName();
    }

    @Override
    public void setName() {
        this.name = Integer.toString((int)(Math.random() * 1000 + 0));
    }

    @Override
    public void setSpeed() {
        if (breakdownTurnsLeft > 0) {
            this.speed = 0;
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
        breakATruck();
        setSpeed();
    }

    @Override
    public void moveForAnHour() {
        this.distanceTraveled += this.speed;
    }

    public void breakATruck() {
        boolean isBroken = ((int)(Math.random() * 100 + 1) <= 5);
        if (isBroken) {
            this.breakdownTurnsLeft += 2;
        }
    }

    public int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }
}
