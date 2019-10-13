package factory.elevator.manager;


import factory.elevator.scheduler.ResponseScheduler;
import factory.elevator.scheduler.Scheduler;
import factory.elevator.scheduler.ThroughputScheduler;

import java.time.LocalDateTime;

public class ElevatorManagerIWithDynamicScheduling extends ElevatorManager {

    public ElevatorManagerIWithDynamicScheduling(int count) {
        super(count);
    }

    @Override
    protected Scheduler getScheduler() {
        Scheduler scheduler = null;
        int hour = LocalDateTime.now().getHour();
        if (hour < 12)
            scheduler = new ResponseScheduler();
        else
            scheduler = new ThroughputScheduler();
        return scheduler;
    }

}
