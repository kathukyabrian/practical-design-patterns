package tech.kitucode.design.adapter.impl;

import tech.kitucode.design.adapter.BMW;

public class BMWImpl implements BMW {
    @Override
    public void runIndicator() {
        System.out.println("Please check left side of the steering wheel");
    }

    @Override
    public void runWipers() {
        System.out.println("Please check right side of the steering wheel");
    }

    @Override
    public void ignite() {
        System.out.println("Press the button on the right side of the steering wheel");
    }

    @Override
    public void charge() {
        System.out.println("Connect car on the charging port at home or charging stations to charge");
    }
}
