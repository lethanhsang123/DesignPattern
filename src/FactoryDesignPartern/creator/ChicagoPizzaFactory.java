package FactoryDesignPartern.creator;

import FactoryDesignPartern.product.*;

public class ChicagoPizzaFactory extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese" -> pizza = new ChicagoStyleCheesePizza();
            case "clam" -> pizza = new ChicagoStyleClamPizza();
            case "pepperoni" -> pizza = new ChicagoStylePepperoniPizza();
            case "veggie" -> pizza = new ChicagoStyleVeggiePizza();
        }

        return pizza;
    }
}
