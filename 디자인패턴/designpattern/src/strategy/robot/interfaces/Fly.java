package strategy.robot.interfaces;

public class Fly implements Move {
    @Override
    public void move() {
        System.out.println("날아다닙니다.");
    }
}
