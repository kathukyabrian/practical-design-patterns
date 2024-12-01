package tech.kitucode.design.command.impl;

import tech.kitucode.design.command.Command;
import tech.kitucode.design.command.vendor.PaypalSend;

public class PaypalPayCommand implements Command {
    private final PaypalSend paypalSend;

    public PaypalPayCommand(PaypalSend paypalSend) {
        this.paypalSend = paypalSend;
    }

    @Override
    public void execute() {
        this.paypalSend.pay();
    }

    @Override
    public void undo() {
        this.paypalSend.reverse();
    }
}
