package abstract_factory.pizza.factory;

import com.factory.pizza.ingredients.cheese.Cheese;
import com.factory.pizza.ingredients.cheese.ReggianoCheese;
import com.factory.pizza.ingredients.clams.Clams;
import com.factory.pizza.ingredients.clams.FreshClams;
import com.factory.pizza.ingredients.dough.Dough;
import com.factory.pizza.ingredients.dough.ThinCrustDough;
import com.factory.pizza.ingredients.pepperoni.Pepperoni;
import com.factory.pizza.ingredients.pepperoni.SlicedPepperoni;
import com.factory.pizza.ingredients.sauce.MarinaraSauce;
import com.factory.pizza.ingredients.sauce.Sauce;
import com.factory.pizza.ingredients.veggies.*;

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
