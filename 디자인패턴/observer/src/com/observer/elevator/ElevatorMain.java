package com.observer.elevator;

import com.observer.elevator.observer.ControlRoomDisplay;
import com.observer.elevator.observer.ElevatorDisplay;
import com.observer.elevator.observer.FloorDisplay;
import com.observer.elevator.observer.VoiceNotice;
import com.observer.elevator.subject.ElevatorController;

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
