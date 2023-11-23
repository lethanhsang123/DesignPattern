package DecoratorPattern.component;

public class Espresso extends Beverage{

    public Espresso() {
        setDescription("Espresso Coffe");
    }

    @Override
    public double cost() {
        return 0.89D;
    }
}
