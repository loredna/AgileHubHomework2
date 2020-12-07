package com.loredanacostea.homework6.command;

public record TurnOff() implements Operation {

    @Override
    public void execute() {
        System.out.println("The lights are off");
    }
}
