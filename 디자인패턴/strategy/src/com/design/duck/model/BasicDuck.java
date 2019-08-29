package com.design.duck.model;

import com.design.duck.fly.FlyWithWings;
import com.design.duck.quack.Quack;

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
