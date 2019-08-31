package com.strategy.game.model;

import com.strategy.game.interfaces.WeaponBehavior;

public abstract class Character {

	WeaponBehavior weaponBehavior;

	public void attack() {
		this.weaponBehavior.attack();
	}

	public abstract void display();

	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior; 
	}

}
