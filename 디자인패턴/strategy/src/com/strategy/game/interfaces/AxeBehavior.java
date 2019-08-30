package com.strategy.game.interfaces;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void attack() {
		System.out.println("도끼로 공격합니다.");
	}

}
