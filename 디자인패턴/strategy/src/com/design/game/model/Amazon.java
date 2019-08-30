package com.design.game.model;

import com.design.game.interfaces.BowAndArrowBehavior;
import com.design.game.interfaces.SwordBehavior;

public class Amazon extends Character {

	public Amazon() {
		this.weaponBehavior = new BowAndArrowBehavior();
	}

	@Override
	public void attack() {
		System.out.println("[�Ƹ����� ����]");
		this.weaponBehavior.attack();
	}

	@Override
	public void display() {
		System.out.println("[�Ƹ����� ���]");
	}
}
