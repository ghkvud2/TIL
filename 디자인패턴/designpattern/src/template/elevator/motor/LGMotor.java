package template.elevator.motor;


import template.elevator.door.Door;
import template.elevator.enums.Direction;

public class LGMotor extends Motor {

    public LGMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("LG 모터를 가동시킨다.");
    }
}
