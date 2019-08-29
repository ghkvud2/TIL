package com.design.game.model;

import com.design.game.weapon.WeaponBehavior;

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
