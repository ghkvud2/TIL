package strategy.duck.interfaces;

public class QuackRubber implements Quack {
    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}
