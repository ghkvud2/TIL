package com.design.robot.model;

import com.design.robot.interfaces.attack.Attack;
import com.design.robot.interfaces.move.Move;

public abstract class Robot {
	private String name;
	private Attack attack;
	private Move move;

	public Robot(String name) {
		this.name = name;
	}

	public void attack() {
		attack.attack();
	}

	public void move() {
		move.move();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Attack getAttack() {
		return attack;
	}

	public void setAttack(Attack attack) {
		this.attack = attack;
	}

	public Move getMove() {
		return move;
	}

	public void setMove(Move move) {
		this.move = move;
	}

}
