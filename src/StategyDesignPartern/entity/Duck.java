package StategyDesignPartern.entity;

import StategyDesignPartern.bihaviors.FlyBehavior;
import StategyDesignPartern.bihaviors.QuackBehavior;

public class Duck extends Animal{
    private FlyBehavior fly;

    private QuackBehavior quack;

    protected Duck(String name, FlyBehavior fly, QuackBehavior quack) {
        super(name);
        this.fly = fly;
        this.quack = quack;
    }

    @Override
    protected void eat() {
        System.out.println("Duck eat");
    }

    public void quack() {
        this.quack.quack();
    }

    public void fly() {
        this.fly.fly();
    }
}
