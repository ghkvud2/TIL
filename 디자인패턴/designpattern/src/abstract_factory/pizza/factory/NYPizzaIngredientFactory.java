package abstract_factory.pizza.factory;


import abstract_factory.pizza.ingredients.cheese.Cheese;
import abstract_factory.pizza.ingredients.cheese.ReggianoCheese;
import abstract_factory.pizza.ingredients.clams.Clams;
import abstract_factory.pizza.ingredients.clams.FreshClams;
import abstract_factory.pizza.ingredients.dough.Dough;
import abstract_factory.pizza.ingredients.dough.ThinCrustDough;
import abstract_factory.pizza.ingredients.pepperoni.Pepperoni;
import abstract_factory.pizza.ingredients.pepperoni.SlicedPepperoni;
import abstract_factory.pizza.ingredients.sauce.MarinaraSauce;
import abstract_factory.pizza.ingredients.sauce.Sauce;
import abstract_factory.pizza.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
