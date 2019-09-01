package com.factory.pizza.pizzastore;

import com.factory.pizza.pizza.ChicagotyleCheesePizza;
import com.factory.pizza.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) pizza = new ChicagotyleCheesePizza();
        return pizza;
    }

}
