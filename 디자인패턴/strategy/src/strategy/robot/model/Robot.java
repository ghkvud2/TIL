package strategy.robot.model;

import strategy.robot.interfaces.Attack;
import strategy.robot.interfaces.Move;

public abstract class Robot {

    Attack attack;
    Move move;

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    public void setMoving(Move move) {
        this.move = move;
    }

    public abstract void display();

    public void attack() {
        attack.attack();
    }

    public void move() {
        move.move();
    }

}
