package FactoryDesignPartern.factory;

public abstract class Pizza {
    private String name;
    private Double price;
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
