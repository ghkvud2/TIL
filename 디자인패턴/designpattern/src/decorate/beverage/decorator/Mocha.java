package decorate.beverage.decorator;

import decorate.beverage.component.Beverage;
import decorate.beverage.component.Beverage.Size;

public class Mocha extends CondimentDecorator {
	public Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", ¸ðÄ«";
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
