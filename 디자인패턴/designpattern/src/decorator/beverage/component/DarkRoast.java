package decorator.beverage.component;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.description = "다크 로스트 커피";
	}

	public double getCost() {
		return .99;
	}

}
