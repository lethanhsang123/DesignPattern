package FactoryDesignPartern.object;

import FactoryDesignPartern.factory.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza pizza;

        pizza = createPizza(type);

        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
