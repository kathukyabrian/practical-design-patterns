package tech.kitucode.design.decorator.spec;

import tech.kitucode.design.decorator.Mazda;
import tech.kitucode.design.decorator.MazdaSpecDecorator;

public class HybridSpecDecorator extends MazdaSpecDecorator {
    Mazda mazda;

    public HybridSpecDecorator(Mazda mazda) {
        this.mazda = mazda;
    }

    @Override
    public String getDescription() {
        return "hybrid " + mazda.getDescription();
    }

    @Override
    public double cost() {
        return mazda.cost() + 400_000;
    }
}
