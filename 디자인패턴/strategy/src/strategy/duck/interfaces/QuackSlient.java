package strategy.duck.interfaces;

public class QuackSlient implements Quack   {
    @Override
    public void quack() {
        System.out.println("울지 못합니다.");
    }
}
