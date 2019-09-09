package strategy.robot.interfaces;

public class Missile implements Attack {
    @Override
    public void attack() {
        System.out.println("미사일로 공격합니다.");
    }
}
