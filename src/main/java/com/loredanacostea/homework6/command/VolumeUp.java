package com.loredanacostea.homework6.command;

public record VolumeUp() implements Operation {

    @Override
    public void execute() {
        System.out.println("The volume has been turned up");
    }
}
