package strategy.duck.interfaces;

public class FlyWithWings implements Fly {
    @Override
    public void fly() {
        System.out.println("날개를 펄럭이며 날아갑니다.");
    }
}
