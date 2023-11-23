package DecoratorPattern.decorator;

import DecoratorPattern.component.Beverage;

public abstract class CondimentDecorator extends Beverage {

    private Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();

    public Beverage getBeverage() {
        return beverage;
    }
}
