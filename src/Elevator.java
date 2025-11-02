import java.util.LinkedList;
import java.util.Queue;

public class Elevator implements ElevatorInterface {
    private int currentFloor = 0;
    private Queue<Integer> targets = new LinkedList<>();

    @Override
    public void move() {
        if (targets.isEmpty()) return;

        int target = targets.peek();

        if (currentFloor < target){
            currentFloor++;
        }
        else if (currentFloor > target){
            currentFloor--;
        }
        else {
            targets.poll();
        }
    }

    @Override
    public void addRequest(int floor) {
        targets.add(floor);
    }

    @Override
    public int getCurrentFloor() {
        return currentFloor;
    }

    @Override
    public boolean isIdle() {
        return targets.isEmpty();
    }
    
    @Override
    public String toString() {
        return "Elevator at floor " + currentFloor +
            (targets.isEmpty() ? " (idle)" : "->" + targets.peek());
    }
}