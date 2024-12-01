package tech.kitucode.design.command.vendor;

public class PaypalSend {
    public void pay() {
        System.out.println("Paying up some money to Mr Fred");
    }

    public void reverse(){
        System.out.println("Refunding money sent to Mr Fred");
    }
}
