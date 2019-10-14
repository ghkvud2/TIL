package decorator.road.decorator;

import decorator.road.component.Display;

public class LineDecorator extends DisplayDecorator {

	public LineDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public void draw() {
		super.draw();
		drawLine();
	}

	private void drawLine() {
		System.out.println("[���� ǥ��]");
	}
}
