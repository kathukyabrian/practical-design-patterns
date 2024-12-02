package tech.kitucode.design.decorator.spec;

import tech.kitucode.design.decorator.Mazda;
import tech.kitucode.design.decorator.MazdaSpecDecorator;

public class SportTrimSpecDecorator extends MazdaSpecDecorator {
    Mazda mazda;

    public SportTrimSpecDecorator(Mazda mazda) {
        this.mazda = mazda;
    }

    @Override
    public String getDescription() {
        return mazda.getDescription() + " sport spec";
    }

    @Override
    public double cost() {
        System.out.println("current cost = " + mazda.cost() + " additional cost = " + 800_000);
        return mazda.cost() + 800_000;
    }
}
