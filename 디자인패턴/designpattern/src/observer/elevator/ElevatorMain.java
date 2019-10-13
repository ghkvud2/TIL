package observer.elevator;


import observer.elevator.observer.ControlRoomDisplay;
import observer.elevator.observer.ElevatorDisplay;
import observer.elevator.observer.FloorDisplay;
import observer.elevator.observer.VoiceNotice;
import observer.elevator.subject.ElevatorController;

public class ElevatorMain {

	public static void main(String[] args) {
		ElevatorController elevatorController = new ElevatorController();
		ElevatorDisplay elevatorDisplay = new ElevatorDisplay(elevatorController);
		VoiceNotice voiceNotice = new VoiceNotice(elevatorController);
		FloorDisplay floorDisplay = new FloorDisplay(elevatorController);
		ControlRoomDisplay controlRoomDisplay = new ControlRoomDisplay(elevatorController);

		for (int i = 2; i <= 5; i++) {
			elevatorController.setFloor(i);
		}

	}

}
