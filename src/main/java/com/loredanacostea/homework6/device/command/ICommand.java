package com.loredanacostea.homework6.device.command;

import com.loredanacostea.homework6.device.IDevice;

public interface ICommand {

    void execute(IDevice device);
}
