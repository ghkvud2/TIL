package strategy.robot.interfaces;

public class Punch implements Attack {
    @Override
    public void attack() {
        System.out.println("주먹으로 공격합니다.");
    }
}
