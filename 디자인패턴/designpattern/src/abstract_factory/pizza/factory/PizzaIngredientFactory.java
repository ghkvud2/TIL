package abstract_factory.pizza.factory;


import abstract_factory.pizza.ingredients.cheese.Cheese;
import abstract_factory.pizza.ingredients.clams.Clams;
import abstract_factory.pizza.ingredients.dough.Dough;
import abstract_factory.pizza.ingredients.pepperoni.Pepperoni;
import abstract_factory.pizza.ingredients.sauce.Sauce;
import abstract_factory.pizza.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
