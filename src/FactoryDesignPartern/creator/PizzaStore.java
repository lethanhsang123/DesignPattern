package FactoryDesignPartern.creator;

import FactoryDesignPartern.product.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza pizza;

        pizza = createPizza(type);

        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
