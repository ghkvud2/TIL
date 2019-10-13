package factory.elevator.manager;


import factory.elevator.scheduler.Scheduler;
import factory.elevator.scheduler.ThroughputScheduler;

public class ElevatorManagerIWithThroughputScheduling extends ElevatorManager {
    public ElevatorManagerIWithThroughputScheduling(int count) {
        super(count);
    }

    @Override
    protected Scheduler getScheduler() {
        return new ThroughputScheduler();
    }
}
