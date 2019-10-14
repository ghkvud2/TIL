package decorator.beverage.decorator;

import decorator.beverage.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
