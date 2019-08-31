package com.observer.elevator.observer;

import com.observer.elevator.subject.ElevatorController;

public class FloorDisplay implements Observer {

	private ElevatorController elevatorController;

	public FloorDisplay(ElevatorController elevatorController) {
		this.elevatorController = elevatorController;
		this.elevatorController.addObserver(this);
	}

	public ElevatorController getElevatorController() {
		return elevatorController;
	}

	public void setElevatorController(ElevatorController elevatorController) {
		this.elevatorController = elevatorController;
	}

	@Override
	public void update() {
		System.out.println("[FloorDisplay] : " + this.elevatorController.getFloor());
	}

}
