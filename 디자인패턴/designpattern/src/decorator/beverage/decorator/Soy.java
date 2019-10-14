package decorator.beverage.decorator;

import decorator.beverage.component.Beverage;

public class Soy extends CondimentDecorator {
	public Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", µŒ¿Ø";
	}

	@Override
	public double getCost() {
		double cost = beverage.getCost();
		if (beverage.getSize() == Size.TALL)
			cost += .10;
		else if (beverage.getSize() == Size.GRANDE)
			cost += .15;
		else if (beverage.getSize() == Size.VENTI)
			cost += .20;
		return cost;
	}

}
