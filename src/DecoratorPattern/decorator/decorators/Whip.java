package DecoratorPattern.decorator.decorators;

import DecoratorPattern.component.Beverage;
import DecoratorPattern.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return getBeverage().cost() + 0.3D;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Whip";
    }
}
