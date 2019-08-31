package com.observer.elevator.subject;

public class ElevatorController extends Subject {

	private int floor = 1;

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
		notifyObservers();
	}

}
