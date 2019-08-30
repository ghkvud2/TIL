package com.design.game.model;

import com.design.game.interfaces.SwordBehavior;

public class Babarian extends Character {

	public Babarian() {
		this.weaponBehavior = new SwordBehavior();
	}

	@Override
	public void attack() {
		System.out.println("[�ٹٸ����� ����]");
		this.weaponBehavior.attack();
	}

	@Override
	public void display() {
		System.out.println("[�ٹٸ����� ���]");
	}

}
