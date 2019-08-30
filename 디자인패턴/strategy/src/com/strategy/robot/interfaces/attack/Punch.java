package com.strategy.robot.interfaces.attack;

public class Punch implements Attack {

	@Override
	public void attack() {
		System.out.println("주먹으로 공격합니다.");
	}

}
