package StategyDesignPartern.bihaviors.impl;

import StategyDesignPartern.bihaviors.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("Fly with wings");
    }
}
