package template.elevator;

import com.template.elevator.door.Door;
import com.template.elevator.enums.Direction;
import com.template.elevator.motor.LGMotor;
import com.template.elevator.motor.Motor;
import com.template.elevator.motor.SamsungMotor;

public class ElevatorMain {

    public static void main(String[] args) {

        Door door = new Door();
        Motor lg = new LGMotor(door);
        Motor samsung = new SamsungMotor(door);

        lg.move(Direction.UP);
        samsung.move(Direction.DOWN);


    }
}
