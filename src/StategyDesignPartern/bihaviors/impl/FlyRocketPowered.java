package StategyDesignPartern.bihaviors.impl;

import StategyDesignPartern.bihaviors.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly rocket powered");
    }
}
