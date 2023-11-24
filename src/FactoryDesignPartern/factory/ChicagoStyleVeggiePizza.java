package FactoryDesignPartern.factory;

public class ChicagoStyleVeggiePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("ChicagoStyleVeggiePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStyleVeggiePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoStyleVeggiePizza cut");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyleVeggiePizza box");
    }
}
