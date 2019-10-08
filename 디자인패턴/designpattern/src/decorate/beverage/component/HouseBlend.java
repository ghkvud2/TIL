package decorate.beverage.component;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.description = "하우스 블렌드 커피";
	}

	public double getCost() {
		return .89;
	}

}
