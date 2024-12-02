package tech.kitucode.design.decorator;

import tech.kitucode.design.decorator.impl.CX5;
import tech.kitucode.design.decorator.spec.CarbonFinishSpecDecorator;
import tech.kitucode.design.decorator.spec.HybridSpecDecorator;
import tech.kitucode.design.decorator.spec.SportTrimSpecDecorator;

public class Main {
    public static void main(String[] args) {
        Mazda cx5 = new CX5();
        cx5 = new CarbonFinishSpecDecorator(cx5);
        cx5 = new HybridSpecDecorator(cx5);
        cx5 = new SportTrimSpecDecorator(cx5);

        System.out.println(cx5.getDescription() + " final price is ksh " + cx5.cost());
    }
}
