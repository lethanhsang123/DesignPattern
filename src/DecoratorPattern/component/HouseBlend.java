package DecoratorPattern.component;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        setDescription("House Blend Coffe");
    }

    @Override
    public double cost() {
        return 1.99D;
    }
}
