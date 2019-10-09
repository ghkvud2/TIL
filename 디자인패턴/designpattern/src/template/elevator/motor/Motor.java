package template.elevator.motor;

import com.template.elevator.door.Door;
import com.template.elevator.enums.Direction;
import com.template.elevator.enums.DoorStatus;
import com.template.elevator.enums.MotorStatus;

public abstract class Motor {

    private Door door;
    private MotorStatus motorStatus;

    public Motor(Door door) {
        this.door = door;
        this.motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();

        if (motorStatus == MotorStatus.MOVING)
            return;

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED)
            door.closeDoor();
        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    protected abstract void moveMotor(Direction direction);

}
