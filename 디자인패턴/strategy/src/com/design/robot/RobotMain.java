package com.design.robot;

import com.design.robot.interfaces.attack.Missile;
import com.design.robot.interfaces.attack.Punch;
import com.design.robot.interfaces.move.Fly;
import com.design.robot.interfaces.move.Walk;
import com.design.robot.model.Atom;
import com.design.robot.model.Robot;
import com.design.robot.model.TaekwonV;

public class RobotMain {
	public static void main(String[] args) {

		Robot taekwonV = new TaekwonV("ÅÂ±Çv");
		taekwonV.setAttack(new Missile());
		taekwonV.setMove(new Walk());
		taekwonV.attack();
		taekwonV.move();

		Robot atom = new Atom("¾ÆÅè");
		atom.setAttack(new Punch());
		atom.setMove(new Fly());
		atom.attack();
		atom.move();
	}
}
