package abstract_factory.pizza.factory;


import abstract_factory.pizza.ingredients.cheese.Cheese;
import abstract_factory.pizza.ingredients.cheese.MozzarellaCheese;
import abstract_factory.pizza.ingredients.clams.Clams;
import abstract_factory.pizza.ingredients.clams.FrozenClams;
import abstract_factory.pizza.ingredients.dough.Dough;
import abstract_factory.pizza.ingredients.dough.ThickCrustDough;
import abstract_factory.pizza.ingredients.pepperoni.Pepperoni;
import abstract_factory.pizza.ingredients.pepperoni.SlicedPepperoni;
import abstract_factory.pizza.ingredients.sauce.PlumTomatoSauce;
import abstract_factory.pizza.ingredients.sauce.Sauce;
import abstract_factory.pizza.ingredients.veggies.BlackOlives;
import abstract_factory.pizza.ingredients.veggies.Eggplant;
import abstract_factory.pizza.ingredients.veggies.Spinach;
import abstract_factory.pizza.ingredients.veggies.Veggies;

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
