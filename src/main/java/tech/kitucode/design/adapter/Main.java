package tech.kitucode.design.adapter;

import tech.kitucode.design.adapter.impl.ToyotaImpl;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new ToyotaAdapter(new ToyotaImpl());
        bmw.ignite();
        bmw.runIndicator();
        bmw.runWipers();
        try {
            bmw.charge();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
