package com.loredanacostea.homework6.device;

public record Phone() implements IDevice {

    @Override
    public void turnOn() {
        System.out.println("Phone is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Phone is off.");
    }

    @Override
    public void turnVolumeUp() {
        System.out.println("The volume has been turned up");
    }

    @Override
    public void turnVolumeDown() {
        System.out.println("The volume has been turned down");
    }
}
