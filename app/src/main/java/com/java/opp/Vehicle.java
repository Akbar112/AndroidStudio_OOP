package com.java.opp;

import androidx.annotation.NonNull;

public class Vehicle extends Object {
    private String name;
    private int speed;
    private final int maxspeed;
    private final  int maxFullTank;
    private int numberOfWheels;
    private final boolean hasAdvanceBrakeSystem;

    /*****
     * Constuctor
     * @param name : Vehicle Name
     * @param speed : Vehicle current speed
     * @param maxspeed : Vehicle max speed
     * @param maxFullTank : Vehicle maximum full tank in liters
     * @param numberOfWheels : Vehicle number of wheels, 2, 3, 4 etc.
     * @param hasAdvanceBrakeSystem : Does Vehicle has Advance brake system
     */

    public Vehicle(String name, int speed, int maxspeed,
                   int maxFullTank, int numberOfWheels, boolean hasAdvanceBrakeSystem) {
        this.name = name;
        this.speed = speed;
        this.maxspeed = maxspeed;
        this.maxFullTank = maxFullTank;
        this.numberOfWheels = numberOfWheels;
        this.hasAdvanceBrakeSystem = hasAdvanceBrakeSystem;
    }

    /**
     *Getter & Setter
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



    public int getMaxspeed() {
        return maxspeed;
    }

    public int getMaxFullTank() {
        return maxFullTank;
    }



    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }



    public boolean isHasAdvanceBrakeSystem() {
        return hasAdvanceBrakeSystem;
    }
    /***** Getter & Setter ***** END *****/

    @NonNull
    @Override
    public String toString() {
        return String.format("%s %s \n%s %s \n %s %s \n%s %s \n%s %s ",
                "Name: ", getName(),
                "Speed:", getSpeed(),
                "Max Speed:", getMaxspeed(),
                "Full  Tank:", getMaxFullTank(),
                "Total Wheels:", getNumberOfWheels(),
                "ABS:", isHasAdvanceBrakeSystem() );
    }

    public String sound() {
        return String.format( "%s", "Ghommmmm Ghommmmmm");
    }
}
