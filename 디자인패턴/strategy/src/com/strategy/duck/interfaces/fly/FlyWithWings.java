package com.strategy.duck.interfaces.fly;


public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날개를 펄럭이며 날아갑니다.");
	}

}
