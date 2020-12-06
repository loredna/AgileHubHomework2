package com.loredanacostea.homework6.device;

public sealed interface IDevice permits Light, Phone {

    void turnOn();

    void turnOff();

    void turnVolumeUp();

    void turnVolumeDown();
}
