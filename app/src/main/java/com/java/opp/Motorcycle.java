package com.java.opp;

import androidx.annotation.NonNull;

public class Motorcycle extends Vehicle {

    private final int totalSeats;

    public Motorcycle(String name, int speed, int maxspeed, int maxFullTank, int numberOfWheels, boolean hasAdvanceBrakeSystem, int totalSeats) {
        super(name, speed, maxspeed, maxFullTank, numberOfWheels, hasAdvanceBrakeSystem);
        this.totalSeats = totalSeats;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s \n%s %s", super.toString(),
                "Total Seats: ", getTotalSeats());
    }

    public String sound() {
        return String.format( "%s", "Ngengggggg Ngeeenggggggg");
    }

}
