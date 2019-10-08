package decorate.beverage.component;

public class Decaf extends Beverage {

	public Decaf() {
		this.description = "디 카페인 커피";
	}

	public double getCost() {
		return 1.05;
	}

}
