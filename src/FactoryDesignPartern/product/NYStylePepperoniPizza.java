package FactoryDesignPartern.product;

public class NYStylePepperoniPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("NYStylePepperoniPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NYStylePepperoniPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NYStylePepperoniPizza cut");
    }

    @Override
    public void box() {
        System.out.println("NYStylePepperoniPizza box");
    }
}
