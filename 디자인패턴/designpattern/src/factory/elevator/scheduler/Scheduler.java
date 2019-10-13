package factory.elevator.scheduler;


import factory.elevator.enums.Direction;
import factory.elevator.manager.ElevatorManager;

public interface Scheduler {
    int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction);
}
