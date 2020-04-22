package com.java.opp;

import androidx.annotation.NonNull;

public class Mercedes extends Car implements Engine {

    private final String seatColor;
    private final String roofTop;
    private String bodyColor;

    public Mercedes(String name, int speed, int maxspeed, int maxFullTank, int numberOfWheels, boolean hasAdvanceBrakeSystem, String engineType, String seatColor, String roofTop, String bodyColor) {
        super(name, speed, maxspeed, maxFullTank, numberOfWheels, hasAdvanceBrakeSystem, engineType);
        this.seatColor = seatColor;
        this.roofTop = roofTop;
        this.bodyColor = bodyColor;
    }

    public String getSeatColor() {
        return seatColor;
    }

    public String getRoofTop() {
        return roofTop;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s \n%s %s \n%s %s \n%s %s", super.toString(),
        "Seat: ", getSeatColor(),
                "Roof: ", getRoofTop(),
                "Body Color: ", getBodyColor());
    }
    public String sound() {
        return String.format( "%s", "Bremmmm Breeemmmmm");
    }

    @Override
    public String goFast() {
        return "Getting Fast";
    }

    @Override
    public String goSlow() {
        return "Slowing Down";
    }

    @Override
    public String startEngine() {
        return "Starting Engine";
    }
}
