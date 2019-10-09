package factory.elevator;

import com.factory.elevator.enums.Direction;
import com.factory.elevator.manager.ElevatorManager;
import com.factory.elevator.manager.ElevatorManagerIWithDynamicScheduling;
import com.factory.elevator.manager.ElevatorManagerIWithResponseTimeScheduling;
import com.factory.elevator.manager.ElevatorManagerIWithThroughputScheduling;
import com.factory.elevator.scheduler.Scheduler;

public class ElevatorMain {

    public static void main(String[] args) {

        int count = 10;
        ElevatorManager elevatorManager = new ElevatorManagerIWithResponseTimeScheduling(count);
        elevatorManager.requestElevator(10, Direction.UP);
        elevatorManager.requestElevator(15, Direction.UP);
        elevatorManager.requestElevator(20, Direction.UP);

        System.out.println();

        elevatorManager = new ElevatorManagerIWithThroughputScheduling(10);
        elevatorManager.requestElevator(10, Direction.UP);
        elevatorManager.requestElevator(15, Direction.UP);
        elevatorManager.requestElevator(20, Direction.UP);

        System.out.println();

        elevatorManager = new ElevatorManagerIWithDynamicScheduling(10);
        elevatorManager.requestElevator(10, Direction.UP);
        elevatorManager.requestElevator(15, Direction.UP);
        elevatorManager.requestElevator(20, Direction.UP);

    }
}
