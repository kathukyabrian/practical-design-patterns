package tech.kitucode.design.decorator.impl;

import tech.kitucode.design.decorator.Mazda;

public class CX3 extends Mazda {
    public CX3() {
        this.description = "CX3";
    }

    @Override
    public double cost() {
        return 1_800_000;
    }
}
