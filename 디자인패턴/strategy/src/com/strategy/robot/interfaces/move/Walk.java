package com.strategy.robot.interfaces.move;

public class Walk implements Move {

	@Override
	public void move() {
		System.out.println("걸어다닙니다.");
	}

}
