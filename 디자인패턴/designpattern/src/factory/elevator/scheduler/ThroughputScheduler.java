package factory.elevator.scheduler;


import factory.elevator.enums.Direction;
import factory.elevator.manager.ElevatorManager;

import java.util.Random;

public class ThroughputScheduler implements Scheduler {
    @Override
    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        Random random = new Random();
        return random.nextInt(elevatorManager.getControllers().size());
    }
}
