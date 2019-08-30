package com.design.duck;

import com.design.duck.interfaces.fly.FlyNoWay;
import com.design.duck.interfaces.fly.FlyWithWings;
import com.design.duck.interfaces.quack.Quack;
import com.design.duck.interfaces.quack.Squeak;
import com.design.duck.model.BasicDuck;
import com.design.duck.model.Duck;
import com.design.duck.model.RubberDuck;

public class DuckMain {
	public static void main(String[] args) {
		Duck basicDuck = new BasicDuck();
		basicDuck.setFlyBehavior(new FlyWithWings());
		basicDuck.setQuackBehavior(new Quack());
		basicDuck.display();
		basicDuck.fly();
		basicDuck.quack();

		Duck rubberDuck = new RubberDuck();
		rubberDuck.setFlyBehavior(new FlyNoWay());
		rubberDuck.setQuackBehavior(new Squeak());
		rubberDuck.display();
		rubberDuck.fly();
		rubberDuck.quack();

	}
}
