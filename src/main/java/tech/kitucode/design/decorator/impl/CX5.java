package tech.kitucode.design.decorator.impl;

import tech.kitucode.design.decorator.Mazda;

public class CX5 extends Mazda {
    public CX5() {
        this.description = "CX5";
    }

    @Override
    public double cost() {
        return 2_500_000;
    }
}
