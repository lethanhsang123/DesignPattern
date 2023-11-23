package StategyDesignPartern.bihaviors.impl;

import StategyDesignPartern.bihaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly no way");
    }
}
