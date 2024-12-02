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
        System.out.println("current cost = " + mazda.cost() + " additional cost = " + 400_000);
        return mazda.cost() + 400_000;
    }
}
