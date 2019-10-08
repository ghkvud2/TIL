package decorate.road.decorator;

import decorate.road.component.Display;

public class DisplayDecorator implements Display {

	private Display decoratedDisplay;

	public DisplayDecorator(Display decoratedDisplay) {
		this.decoratedDisplay = decoratedDisplay;
	}

	@Override
	public void draw() {
		decoratedDisplay.draw();
	}

}
