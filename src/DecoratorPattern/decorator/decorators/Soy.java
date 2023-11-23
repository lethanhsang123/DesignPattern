package DecoratorPattern.decorator.decorators;

import DecoratorPattern.component.Beverage;
import DecoratorPattern.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return getBeverage().cost() + 0.45D;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Soy";
    }
}
