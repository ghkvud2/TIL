package factory.elevator;


import factory.elevator.enums.Direction;
import factory.elevator.manager.ElevatorManager;
import factory.elevator.manager.ElevatorManagerIWithDynamicScheduling;
import factory.elevator.manager.ElevatorManagerIWithResponseTimeScheduling;
import factory.elevator.manager.ElevatorManagerIWithThroughputScheduling;

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
