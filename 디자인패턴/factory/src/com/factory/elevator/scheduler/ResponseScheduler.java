package com.factory.elevator.scheduler;

import com.factory.elevator.enums.Direction;
import com.factory.elevator.manager.ElevatorManager;

import java.util.Random;

public class ResponseScheduler implements Scheduler {
    @Override
    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        Random random = new Random();
        return random.nextInt(elevatorManager.getControllers().size());
    }
}
