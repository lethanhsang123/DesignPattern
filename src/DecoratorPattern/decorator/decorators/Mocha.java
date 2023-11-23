package DecoratorPattern.decorator.decorators;

import DecoratorPattern.component.Beverage;
import DecoratorPattern.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return getBeverage().cost() + 0.20D;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Mocha" ;
    }
}
