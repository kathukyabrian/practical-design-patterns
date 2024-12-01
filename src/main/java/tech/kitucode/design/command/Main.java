package tech.kitucode.design.command;

import tech.kitucode.design.command.impl.MpesaSendCommand;
import tech.kitucode.design.command.impl.PaypalPayCommand;
import tech.kitucode.design.command.vendor.MpesaSend;
import tech.kitucode.design.command.vendor.PaypalSend;

public class Main {
    public static void main(String[] args) {
        MpesaSend mpesaSend = new MpesaSend();
        PaypalSend paypalSend = new PaypalSend();

        Command mpesa = new MpesaSendCommand(mpesaSend);
        Command paypal = new PaypalPayCommand(paypalSend);

        mpesa.execute();
        mpesa.undo();

        System.out.println("---------------------------------------");
        paypal.execute();
        paypal.undo();
    }
}
