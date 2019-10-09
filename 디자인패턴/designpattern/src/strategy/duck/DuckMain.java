package strategy.duck;

import strategy.duck.interfaces.FlyNoWings;
import strategy.duck.interfaces.FlyWithWings;
import strategy.duck.interfaces.Quack;
import strategy.duck.interfaces.QuackRobot;
import strategy.duck.interfaces.QuackRubber;
import strategy.duck.interfaces.QuackSlient;
import strategy.duck.model.Duck;
import strategy.duck.model.RobotDuck;
import strategy.duck.model.RubberDuck;
import strategy.duck.model.WoodDuck;

public class DuckMain {

    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.setFly(new FlyNoWings());
        rubberDuck.setQuack(new QuackRubber());
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.fly();
        System.out.println();
        Duck woodDuck = new WoodDuck();
        woodDuck.setFly(new FlyWithWings());
        woodDuck.setQuack(new QuackSlient());
        woodDuck.display();
        woodDuck.quack();
        woodDuck.fly();
        System.out.println();
        Duck robotDuck = new RobotDuck();
        robotDuck.setFly(new FlyNoWings());
        robotDuck.setQuack(new QuackRobot());
        robotDuck.display();
        robotDuck.quack();
        robotDuck.fly();

    }
}
