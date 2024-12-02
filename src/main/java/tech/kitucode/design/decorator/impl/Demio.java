package tech.kitucode.design.decorator.impl;

import tech.kitucode.design.decorator.Mazda;

public class Demio extends Mazda {
    public Demio() {
        this.description = "Demio";
    }

    @Override
    public double cost() {
        return 1_100_000;
    }
}
