package com.design.duck.model;

import com.design.duck.fly.FlyBehavior;
import com.design.duck.quack.QuackBehavior;

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
