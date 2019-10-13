package factory.elevator.manager;


import factory.elevator.scheduler.ResponseScheduler;
import factory.elevator.scheduler.Scheduler;

public class ElevatorManagerIWithResponseTimeScheduling extends ElevatorManager {
    public ElevatorManagerIWithResponseTimeScheduling(int count) {
        super(count);
    }

    @Override
    protected Scheduler getScheduler() {
        return new ResponseScheduler();
    }
}
