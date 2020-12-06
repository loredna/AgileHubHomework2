package com.loredanacostea.homework6.device;

public record Light() implements IDevice {

    @Override
    public void turnOn() {
        System.out.println("The lights are on");
    }

    @Override
    public void turnOff() {
        System.out.println("The lights are off");
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
