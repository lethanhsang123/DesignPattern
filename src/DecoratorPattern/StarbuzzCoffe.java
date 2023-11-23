package DecoratorPattern;

import DecoratorPattern.component.Beverage;
import DecoratorPattern.component.Espresso;
import DecoratorPattern.component.HouseBlend;
import DecoratorPattern.decorator.decorators.Mocha;
import DecoratorPattern.decorator.decorators.Soy;
import DecoratorPattern.decorator.decorators.Whip;

public class StarbuzzCoffe {

    public static void main(String[] args) {
        // Order up an Espresso, no condiments
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        // Order up a DarkRoast
        Beverage houseBlend = new HouseBlend();
        // wrap it with a Mocha
        houseBlend = new Mocha(houseBlend);
        // wrap it with Soy
        houseBlend = new Soy(houseBlend);
        // wrap it with Whip
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }

}
