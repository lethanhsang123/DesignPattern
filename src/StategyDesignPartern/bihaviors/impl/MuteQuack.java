package StategyDesignPartern.bihaviors.impl;

import StategyDesignPartern.bihaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("mute quack");
    }
}
