package strategy.duck.model;

import strategy.duck.interfaces.Fly;
import strategy.duck.interfaces.Quack;

public abstract class Duck {

    Quack quack;
    Fly fly;

    public abstract void display();

    public void setQuack(Quack quack) {
        this.quack = quack;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public void quack() {
        quack.quack();
    }

    public void fly() {
        fly.fly();
    }

}
