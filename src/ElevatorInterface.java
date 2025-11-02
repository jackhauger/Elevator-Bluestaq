public interface ElevatorInterface {
    void move();  // Handles logic that moves the elevator up and down

    void addRequest(int floor);  // Adds requested floor to the linked list

    int getCurrentFloor();  // Returns the floor of the building that the elevator is currently on

    boolean isIdle();  // Returns true if elevator needs to be stopped for maintainence
}