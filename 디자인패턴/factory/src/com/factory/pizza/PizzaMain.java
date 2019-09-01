package com.factory.pizza;

import com.factory.pizza.pizza.Pizza;
import com.factory.pizza.pizzastore.ChicagoPizzaStore;
import com.factory.pizza.pizzastore.NYPizzaStore;
import com.factory.pizza.pizzastore.PizzaStore;

public class PizzaMain {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        System.out.println();

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}
