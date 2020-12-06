package com.loredanacostea.homework6.device.command;

import com.loredanacostea.homework6.device.IDevice;

public class VolumeDownCommand implements ICommand {

    @Override
    public void execute(IDevice device) {
        device.turnVolumeDown();
    }
}