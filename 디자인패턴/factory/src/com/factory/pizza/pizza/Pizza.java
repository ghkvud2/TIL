package com.factory.pizza.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toping = new ArrayList<>();

    public void prepare() {
        System.out.println(name + " 피자를 준비합니다.");
        System.out.println("반죽을 준비합니다.");
        System.out.println("소스를 뿌립니다.");
        System.out.print("[토핑] : ");
        for (String s : toping) {
            System.out.println(s + " ");
        }
    }

    public void bake() {
        System.out.println("피자를 굽습니다.");
    }

    public void cut() {
        System.out.println("피자를 자릅니다.");
    }

    public void box() {
        System.out.println("피자를 포장합니다.");
    }

    public String getName() {
        return name;
    }
}
