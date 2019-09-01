package com.factory.pizza.pizza;

public class ChicagotyleCheesePizza extends Pizza {

    public ChicagotyleCheesePizza() {
        name = "시카고 치즈피자";
        dough = "두껍고 폭신한 반죽";
        sauce = "토마토 소스";
        toping.add("딥 디쉬 치즈");
    }

    @Override
    public void cut() {
        System.out.println("피자를 사각형으로 자릅니다.");
    }
}
