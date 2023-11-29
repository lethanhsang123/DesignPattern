package FactoryDesignPartern.product;

public class NYStyleClamPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("NYStyleClamPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NYStyleClamPizza prepare");
    }

    @Override
    public void cut() {
        System.out.println("NYStyleClamPizza cut");
    }

    @Override
    public void box() {
        System.out.println("NYStyleClamPizza box");
    }
}
