public interface BuildingInterface {
    void requestElevator(int sourceFloor, int destinationFloor);  // Method to call elevator from a floor and request a destination

    void step();  // "Tick" method that will move the elevator

    boolean isIdle();  // Returns true if elevator needs to be stopped for maintainence
}