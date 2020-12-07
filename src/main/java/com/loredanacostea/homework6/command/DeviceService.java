package com.loredanacostea.homework6.command;

public class DeviceService {

    public static void main(String[] args) {
        var operationExecutor = new OperationExecutor();

        operationExecutor.executeOperation(new TurnOn());
        operationExecutor.executeOperation(new TurnOff());
        operationExecutor.executeOperation(new VolumeUp());
        operationExecutor.executeOperation(new VolumeDown());
    }
}
