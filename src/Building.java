public class Building implements BuildingInterface {
    private final Elevator elevator;
    private final int floors;

    public Building(int floors) {
        this.floors = floors;
        this.elevator = new Elevator();
    }

    @Override
    public void requestElevator(int sourceFloor, int destinationFloor) {
        System.out.println("Request from " + sourceFloor + " to " + destinationFloor);
        elevator.addRequest(sourceFloor);
        elevator.addRequest(destinationFloor);
    }

    @Override
    public void step() {
        elevator.move();
        System.out.println(elevator);
    }
}