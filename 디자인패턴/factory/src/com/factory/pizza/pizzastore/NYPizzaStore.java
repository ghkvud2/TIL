package com.factory.pizza.pizzastore;

import com.factory.pizza.pizza.NYStyleCheesePizza;
import com.factory.pizza.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) pizza = new NYStyleCheesePizza();
        return pizza;
    }

}
