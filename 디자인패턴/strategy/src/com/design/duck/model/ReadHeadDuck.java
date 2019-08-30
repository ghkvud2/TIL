package com.design.duck.model;

import com.design.duck.interfaces.fly.FlyWithWings;
import com.design.duck.interfaces.quack.Quack;

public class ReadHeadDuck extends Duck{

	public ReadHeadDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("빨간 머리를 가진 오리 모습");
	}

}
