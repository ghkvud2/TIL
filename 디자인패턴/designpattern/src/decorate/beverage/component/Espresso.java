package decorate.beverage.component;

public class Espresso extends Beverage {

	public Espresso() {
		this.description = "에스프레소";
	}

	public double getCost() {
		return 1.99;
	}

}
