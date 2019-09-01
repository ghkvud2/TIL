package com.factory.elevator.manager;

import com.factory.elevator.controller.ElevatorController;
import com.factory.elevator.enums.Direction;
import com.factory.elevator.scheduler.Scheduler;

import java.util.ArrayList;
import java.util.List;

public abstract class ElevatorManager {

    List<ElevatorController> controllers;

    public ElevatorManager(int count) {
        controllers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            controllers.add(new ElevatorController(i + 1));
        }
    }

    public void requestElevator(int destination, Direction direction) {
        Scheduler scheduler = getScheduler();
        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }

    protected abstract Scheduler getScheduler();

    public List<ElevatorController> getControllers() {
        return controllers;
    }
}
