package com.design.game.model;

import com.design.game.weapon.BowAndArrowBehavior;
import com.design.game.weapon.SwordBehavior;

public class Amazon extends Character {

	public Amazon() {
		this.weaponBehavior = new BowAndArrowBehavior();
	}

	@Override
	public void attack() {
		System.out.println("[아마존의 공격]");
		this.weaponBehavior.attack();
	}

	@Override
	public void display() {
		System.out.println("[아마존의 모습]");
	}
}
