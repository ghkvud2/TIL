package com.strategy.game.interfaces;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void attack() {
		System.out.println("검으로 공격합니다.");
	}

}
