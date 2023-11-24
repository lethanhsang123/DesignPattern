package FactoryDesignPartern.factory;

public class ChicagoStyleCheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("ChicagoStyleCheesePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStyleCheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoStyleCheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyleCheesePizza box");
    }
}
