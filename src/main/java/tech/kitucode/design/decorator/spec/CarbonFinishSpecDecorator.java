package tech.kitucode.design.decorator.spec;

import tech.kitucode.design.decorator.Mazda;
import tech.kitucode.design.decorator.MazdaSpecDecorator;

public class CarbonFinishSpecDecorator extends MazdaSpecDecorator {
    Mazda mazda;

    public CarbonFinishSpecDecorator(Mazda mazda) {
        this.mazda = mazda;
    }

    @Override
    public String getDescription() {
        return mazda.getDescription() + " with carbon finish";
    }

    @Override
    public double cost() {
        return 200_000 + mazda.cost();
    }
}
