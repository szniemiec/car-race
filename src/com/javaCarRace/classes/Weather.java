package com.javaCarRace.classes;

public class Weather {

    private boolean isRaining;

    public Weather() {
        this.isRaining = this.setRaining();
    }

    public boolean getIsRaining() {
        return isRaining;
    }

    public boolean setRaining() {
        int maxPercentage = 100;
        int minPercentage = 1;
        int chance = 30;
        isRaining = ((int)(Math.random() * maxPercentage + minPercentage) <= chance);
        return isRaining;
    }

}
