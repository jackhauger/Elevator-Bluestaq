public class Building implements BuildingInterface {
    private final Elevator elevator;
    private final int floors;
    private final BuildingDisplay display

    public Building(int floors) {
        this.floors = floors;
        this.elevator = new Elevator();
        this.display = new BuildingDisplay(floors);
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
        display.render(elevator.getCurrentFloor());
    }
}