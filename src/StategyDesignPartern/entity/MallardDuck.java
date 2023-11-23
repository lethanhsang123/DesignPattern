package StategyDesignPartern.entity;

import StategyDesignPartern.bihaviors.FlyBehavior;
import StategyDesignPartern.bihaviors.QuackBehavior;

public class MallardDuck extends Duck{
    protected MallardDuck(String name,
                          FlyBehavior fly,
                          QuackBehavior quack) {
        super(name, null , quack);
    }

}
