package tech.kitucode.design.adapter;

import tech.kitucode.design.adapter.exception.UnsupportedOperationException;

// this will take in a toyota obj and adapt it to the BMW
public class ToyotaAdapter implements BMW {
    Toyota toyota;

    public ToyotaAdapter(Toyota toyota) {
        this.toyota = toyota;
    }

    @Override
    public void runIndicator() {
        toyota.indicate();
    }

    @Override
    public void runWipers() {
        toyota.wipe();
    }

    @Override
    public void ignite() {
        toyota.ignite();
    }

    @Override
    public void charge() {
        throw new UnsupportedOperationException("Toyotas cannot be charged");
    }
}
