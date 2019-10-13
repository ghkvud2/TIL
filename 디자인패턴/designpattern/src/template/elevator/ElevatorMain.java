package template.elevator;


import template.elevator.door.Door;
import template.elevator.enums.Direction;
import template.elevator.motor.LGMotor;
import template.elevator.motor.Motor;
import template.elevator.motor.SamsungMotor;

public class ElevatorMain {

    public static void main(String[] args) {

        Door door = new Door();
        Motor lg = new LGMotor(door);
        Motor samsung = new SamsungMotor(door);

        lg.move(Direction.UP);
        samsung.move(Direction.DOWN);


    }
}
