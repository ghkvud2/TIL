package factory.elevator.controller;

public class ElevatorController {
    private int id;
    private int curFloor;

    public ElevatorController(int id) {
        this.id = id;
        this.curFloor = 1;
    }

    public void gotoFloor(int destination) {
        System.out.println("[Id] : " + id + " [Floor] : " + curFloor + " => " + destination);
        curFloor = destination;
    }
}
