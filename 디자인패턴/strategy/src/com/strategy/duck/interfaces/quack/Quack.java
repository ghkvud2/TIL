package com.strategy.duck.interfaces.quack;


public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("꽥꽥");
	}

}
