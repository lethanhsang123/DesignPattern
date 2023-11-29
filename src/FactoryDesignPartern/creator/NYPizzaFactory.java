package FactoryDesignPartern.creator;

import FactoryDesignPartern.product.*;

public class NYPizzaFactory extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese" -> pizza = new NYStyleCheesePizza();
            case "clam" -> pizza = new NYStyleClamPizza();
            case "pepperoni" -> pizza = new NYStylePepperoniPizza();
            case "veggie" -> pizza = new NYStyleVeggiePizza();
        }

        return pizza;
    }
}
