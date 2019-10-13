package template.elevator.motor;


import template.elevator.door.Door;
import template.elevator.enums.Direction;

public class SamsungMotor extends Motor {

    public SamsungMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("삼성 모터를 가동시킨다.");
    }
}
