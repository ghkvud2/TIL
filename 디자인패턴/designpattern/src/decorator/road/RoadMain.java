package decorator.road;

import decorator.road.component.Display;
import decorator.road.component.RoadDisplay;
import decorator.road.decorator.LineDecorator;
import decorator.road.decorator.TrafficDecorator;

public class RoadMain {

	public static void main(String[] args) {

		Display road = new RoadDisplay();
		road.draw();

		Display roadWithLine = new LineDecorator(new RoadDisplay());
		roadWithLine.draw();

		Display roadTraffic = new TrafficDecorator(new RoadDisplay());
		roadTraffic.draw();

	}
}
