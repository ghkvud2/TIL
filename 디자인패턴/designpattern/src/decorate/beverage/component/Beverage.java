package decorate.beverage.component;

public abstract class Beverage {

	public enum Size {
		TALL, GRANDE, VENTI
	};

	public Size size = Size.TALL;
	public String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public abstract double getCost();

}
