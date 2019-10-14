package decorator.beverage;

import decorator.beverage.component.Beverage;
import decorator.beverage.component.DarkRoast;
import decorator.beverage.component.Espresso;
import decorator.beverage.component.HouseBlend;
import decorator.beverage.component.Beverage.Size;
import decorator.beverage.decorator.Mocha;
import decorator.beverage.decorator.Soy;
import decorator.beverage.decorator.Whip;

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
