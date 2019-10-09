package template.elevator.door;

import com.template.elevator.enums.DoorStatus;

public class Door {

    DoorStatus doorStatus;

    public Door() {
        this.doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public void openDoor(){
        this.doorStatus = DoorStatus.OPENED;
    }

    public void closeDoor(){
        this.doorStatus = DoorStatus.CLOSED;
    }
}
