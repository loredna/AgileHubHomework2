package com.loredanacostea.homework6.command;

public sealed interface Operation permits TurnOn, TurnOff, VolumeUp, VolumeDown {

    void execute();
}
