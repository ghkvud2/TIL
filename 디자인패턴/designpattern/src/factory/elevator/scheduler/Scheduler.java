package factory.elevator.scheduler;

import com.factory.elevator.enums.Direction;
import com.factory.elevator.manager.ElevatorManager;

public interface Scheduler {
    int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction);
}
