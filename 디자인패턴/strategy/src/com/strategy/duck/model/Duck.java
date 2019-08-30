package com.strategy.duck.model;

import com.strategy.duck.interfaces.fly.FlyBehavior;
import com.strategy.duck.interfaces.quack.QuackBehavior;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public void swim() {
		System.out.println("수영을 합니다.");
	}

	public abstract void display();

	public void quack() {
		quackBehavior.quack();
	}

	public void fly() {
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
