package abstract_factory.pizza.factory;

import com.factory.pizza.ingredients.cheese.Cheese;
import com.factory.pizza.ingredients.clams.Clams;
import com.factory.pizza.ingredients.dough.Dough;
import com.factory.pizza.ingredients.pepperoni.Pepperoni;
import com.factory.pizza.ingredients.sauce.Sauce;
import com.factory.pizza.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
