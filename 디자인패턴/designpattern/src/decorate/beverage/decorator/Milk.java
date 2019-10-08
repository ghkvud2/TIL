package decorate.beverage.decorator;

import decorate.beverage.component.Beverage;

public class Milk extends CondimentDecorator {
	public Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", ½ºÆÀ¹ÐÅ©";
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
