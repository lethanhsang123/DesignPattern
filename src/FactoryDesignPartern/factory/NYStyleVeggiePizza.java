package FactoryDesignPartern.factory;

public class NYStyleVeggiePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("NYStyleVeggiePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NYStyleVeggiePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NYStyleVeggiePizza cut");
    }

    @Override
    public void box() {
        System.out.println("NYStyleVeggiePizza box");
    }
}
