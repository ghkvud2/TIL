package com.strategy.game.model;

import com.strategy.game.interfaces.SwordBehavior;

public class Babarian extends Character {

	public Babarian() {
		this.weaponBehavior = new SwordBehavior();
	}

	@Override
	public void attack() {
		this.weaponBehavior.attack();
	}

	@Override
	public void display() {
		System.out.println("바바리안의 모습입니다.");
	}

}
