package observer.src.com.observer.elevator.observer;

import com.observer.elevator.subject.ElevatorController;

public class ControlRoomDisplay implements Observer {

	private ElevatorController elevatorController;

	public ControlRoomDisplay(ElevatorController elevatorController) {
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
		System.out.println("[ControlRoomDisplay] : " + this.elevatorController.getFloor());
	}

}
