package com.strategy.game.interfaces;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void attack() {
		System.out.println("칼로 공격합니다.");
	}

}
