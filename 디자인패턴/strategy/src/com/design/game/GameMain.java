package com.design.game;

import com.design.game.interfaces.AxeBehavior;
import com.design.game.interfaces.BowAndArrowBehavior;
import com.design.game.model.Amazon;
import com.design.game.model.Babarian;
import com.design.game.model.Character;

public class GameMain {

	public static void main(String[] args) {
		Character amazon = new Amazon();
		amazon.setWeaponBehavior(new BowAndArrowBehavior());
		amazon.attack();
		amazon.display();

		Character babarian = new Babarian();
		babarian.setWeaponBehavior(new AxeBehavior());
		babarian.attack();
		babarian.display();
	}
}
