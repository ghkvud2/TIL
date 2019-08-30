package com.strategy.duck.model;

import com.strategy.duck.interfaces.fly.FlyWithWings;
import com.strategy.duck.interfaces.quack.Quack;

public class ReadHeadDuck extends Duck {

	public ReadHeadDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("빨간 머리를 가진 오리 모습");
	}

}
