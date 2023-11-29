package FactoryDesignPartern.product;

public class ChicagoStyleClamPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("ChicagoStyleClamPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStyleClamPizza prepare");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoStyleClamPizza cut");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyleClamPizza box");
    }
}
