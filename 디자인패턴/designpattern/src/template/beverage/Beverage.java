package template.beverage;

import java.io.IOException;

public abstract class Beverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        try {
            if (customerWantsCondiments())
                addCondiments();
        } catch (IOException e) {
            e.printStackTrace();
        }
        pourInCup();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("물을 끓입니다.");
    }

    void pourInCup() {
        System.out.println("컵에 담습니다.");
    }

    boolean customerWantsCondiments() throws IOException {
        return true;
    }

}
