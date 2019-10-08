package decorate.beverage.decorator;

import decorate.beverage.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
