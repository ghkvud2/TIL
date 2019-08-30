package com.design.game.interfaces;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void attack() {
		System.out.println("활과 화살로 공격합니다.");
	}

}
