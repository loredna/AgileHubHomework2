package com.loredanacostea.homework6.device;

import com.loredanacostea.homework6.device.command.TurnOffCommand;
import com.loredanacostea.homework6.device.command.TurnOnCommand;
import com.loredanacostea.homework6.device.command.VolumeDownCommand;
import com.loredanacostea.homework6.device.command.VolumeUpCommand;

public class DeviceService {

    public static void main(String[] args) {
        var onCommand = new TurnOnCommand();
        onCommand.execute(new Light());

        var offCommand = new TurnOffCommand();
        offCommand.execute(new Light());

        var volumeUpCommand = new VolumeUpCommand();
        volumeUpCommand.execute(new Phone());

        var volumeDownCommand = new VolumeDownCommand();
        volumeDownCommand.execute(new Phone());
    }
}
