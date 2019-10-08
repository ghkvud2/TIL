package command.remotecontroller;

import command.remotecontroller.command.GarageDoorDownCommand;
import command.remotecontroller.command.GarageDoorUpCommand;
import command.remotecontroller.command.LightOffCommand;
import command.remotecontroller.command.LightOnCommand;
import command.remotecontroller.command.StereoOffCommand;
import command.remotecontroller.command.StereoOnWithCDCommand;
import command.remotecontroller.invoker.RemoteController;
import command.remotecontroller.receiver.GarageDoor;
import command.remotecontroller.receiver.Light;
import command.remotecontroller.receiver.Stereo;

public class RemoteControllerMain {
	public static void main(String[] args) {

		RemoteController remoteController = new RemoteController();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		remoteController.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteController.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteController.setCommand(2, stereoOnWithCD, stereoOff);

		System.out.println(remoteController);

		remoteController.onButtonWasPushed(0);
		remoteController.offButtonWasPushed(0);
		remoteController.onButtonWasPushed(1);
		remoteController.offButtonWasPushed(1);
		remoteController.onButtonWasPushed(2);
		remoteController.offButtonWasPushed(2);
	}
}
