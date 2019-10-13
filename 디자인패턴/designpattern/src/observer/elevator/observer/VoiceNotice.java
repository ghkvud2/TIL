package observer.elevator.observer;


import observer.elevator.subject.ElevatorController;

public class VoiceNotice implements Observer {

	private ElevatorController elevatorController;

	public VoiceNotice(ElevatorController elevatorController) {
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
		System.out.println("[VoiceNotice] : " + this.elevatorController.getFloor());
	}

}
