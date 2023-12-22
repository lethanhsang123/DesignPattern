package FactoryDesignPartern;

import FactoryDesignPartern.creator.ChicagoPizzaFactory;
import FactoryDesignPartern.creator.NYPizzaFactory;
import FactoryDesignPartern.creator.PizzaStore;
import FactoryDesignPartern.product.Pizza;

public class test {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaFactory();
        PizzaStore chicagoStore = new ChicagoPizzaFactory();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }

}
