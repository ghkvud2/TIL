package com.factory.pizza.factory;

import com.factory.pizza.ingredients.cheese.Cheese;
import com.factory.pizza.ingredients.cheese.MozzarellaCheese;
import com.factory.pizza.ingredients.clams.Clams;
import com.factory.pizza.ingredients.clams.FrozenClams;
import com.factory.pizza.ingredients.dough.Dough;
import com.factory.pizza.ingredients.dough.ThickCrustDough;
import com.factory.pizza.ingredients.pepperoni.Pepperoni;
import com.factory.pizza.ingredients.pepperoni.SlicedPepperoni;
import com.factory.pizza.ingredients.sauce.PlumTomatoSauce;
import com.factory.pizza.ingredients.sauce.Sauce;
import com.factory.pizza.ingredients.veggies.BlackOlives;
import com.factory.pizza.ingredients.veggies.Eggplant;
import com.factory.pizza.ingredients.veggies.Spinach;
import com.factory.pizza.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory
        implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(),
                new Spinach(),
                new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
