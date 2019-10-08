package decorate.beverage;

import decorate.beverage.component.Beverage;
import decorate.beverage.component.DarkRoast;
import decorate.beverage.component.Espresso;
import decorate.beverage.component.HouseBlend;
import decorate.beverage.component.Beverage.Size;
import decorate.beverage.decorator.Mocha;
import decorate.beverage.decorator.Soy;
import decorate.beverage.decorator.Whip;

public class BeverageMain {

	public static void main(String[] args) {

		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + String.format("%.2f", beverage.getCost()));

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + String.format("%.2f", beverage2.getCost()));

		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Size.TALL);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Soy(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + String.format("%.2f", beverage3.getCost()));

	}
}
