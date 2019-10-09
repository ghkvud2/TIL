package strategy.duck.interfaces;

public class FlyNoWings implements Fly {
    @Override
    public void fly() {
        System.out.println("날지 못합니다.");
    }
}
