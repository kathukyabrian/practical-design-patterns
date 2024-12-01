package tech.kitucode.design.command.vendor;

public class MpesaSend {
    public void send() {
        System.out.println("Sending money to Brian...");
    }

    public void reverse() {
        System.out.println("Reversing the last transaction of money sent to Brian...");
    }
}
