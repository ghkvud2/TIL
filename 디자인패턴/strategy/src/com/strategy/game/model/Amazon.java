package com.strategy.game.model;

import com.strategy.game.interfaces.BowAndArrowBehavior;
import com.strategy.game.interfaces.SwordBehavior;

public class Amazon extends com.strategy.game.model.Character {

	public Amazon() {
		this.weaponBehavior = new BowAndArrowBehavior();
	}

	@Override
	public void attack() {
		this.weaponBehavior.attack();
	}

	@Override
	public void display() {
		System.out.println("아마존의 모습입니다.");
	}
}
