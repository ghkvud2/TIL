package decorator.beverage.decorator;

import decorator.beverage.component.Beverage;

public class Whip extends CondimentDecorator {
	public Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", »÷«Œ";
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
