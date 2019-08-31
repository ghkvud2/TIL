package com.strategy.duck.model;

import com.strategy.duck.interfaces.fly.FlyNoWay;
import com.strategy.duck.interfaces.quack.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("고무 오리 모습");
	}

}
