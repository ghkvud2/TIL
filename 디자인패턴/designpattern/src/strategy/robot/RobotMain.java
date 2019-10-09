package strategy.robot;

import strategy.robot.interfaces.Fly;
import strategy.robot.interfaces.Missile;
import strategy.robot.interfaces.Punch;
import strategy.robot.interfaces.Walk;
import strategy.robot.model.Atom;
import strategy.robot.model.Robot;
import strategy.robot.model.TaekwonV;

public class RobotMain {

    public static void main(String[] args) {
        Robot taekwon = new TaekwonV();
        taekwon.setAttack(new Missile());
        taekwon.setMoving(new Walk());
        taekwon.display();
        taekwon.attack();
        taekwon.move();

        System.out.println();

        Robot atom = new Atom();
        atom.setAttack(new Punch());
        atom.setMoving(new Fly());
        atom.display();
        atom.attack();
        atom.move();
    }
}
