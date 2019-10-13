package factory.pizza;


import factory.pizza.pizza.Pizza;
import factory.pizza.pizzastore.ChicagoPizzaStore;
import factory.pizza.pizzastore.NYPizzaStore;
import factory.pizza.pizzastore.PizzaStore;

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
