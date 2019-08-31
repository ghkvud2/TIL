package com.strategy.duck.model;

import com.strategy.duck.interfaces.fly.FlyWithWings;
import com.strategy.duck.interfaces.quack.Quack;

public class BasicDuck extends Duck {

	public BasicDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("일반 오리 모습");
	}

}
