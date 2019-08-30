package com.design.duck.model;

import com.design.duck.interfaces.fly.FlyNoWay;
import com.design.duck.interfaces.quack.Squeak;

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
