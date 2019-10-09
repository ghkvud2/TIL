package factory.elevator.manager;

import com.factory.elevator.scheduler.ResponseScheduler;
import com.factory.elevator.scheduler.Scheduler;
import com.factory.elevator.scheduler.ThroughputScheduler;

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
