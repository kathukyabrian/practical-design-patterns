package tech.kitucode.design.command.impl;

import tech.kitucode.design.command.Command;
import tech.kitucode.design.command.vendor.MpesaSend;

public class MpesaSendCommand implements Command {
    private final MpesaSend mpesaSend;

    public MpesaSendCommand(MpesaSend mpesaSend) {
        this.mpesaSend = mpesaSend;
    }

    @Override
    public void execute() {
        this.mpesaSend.send();
    }

    @Override
    public void undo() {
        this.mpesaSend.reverse();
    }
}
