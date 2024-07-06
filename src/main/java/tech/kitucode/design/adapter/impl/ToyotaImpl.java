package tech.kitucode.design.adapter.impl;

import tech.kitucode.design.adapter.Toyota;

public class ToyotaImpl implements Toyota {
    @Override
    public void indicate() {
        System.out.println("Check on right side of steering wheel");
    }

    @Override
    public void wipe() {
        System.out.println("Check left side of steering wheel");
    }

    @Override
    public void ignite() {
        System.out.println("Use key to ignite the car");
    }

    @Override
    public void fuel() {
        System.out.println("Head over to gas station and open tank to fuel");
    }

    @Override
    public void shiftGears() {
        System.out.println("Use the gear to shift up and down");
    }
}
