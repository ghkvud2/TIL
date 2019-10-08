package decorate.road;

import decorate.road.component.Display;
import decorate.road.component.RoadDisplay;
import decorate.road.decorator.LineDecorator;
import decorate.road.decorator.TrafficDecorator;

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
