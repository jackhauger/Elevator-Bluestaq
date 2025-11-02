public interface ElevatorInterface {
    void move();
    void addRequest(int floor);
    int getCurrentFloor();
    boolean isIdle();
}