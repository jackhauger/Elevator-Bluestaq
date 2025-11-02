import java.util.LinkedList;
import java.util.Queue;

public class Elevator implements ElevatorInterface {
    private int currentFloor = 0;
    private Queue<Integer> targets = new LinkedList<>();

    @Override
    public void move() {
        if (targets.isEmpty()) return;  // Already on the right floor

        int target = targets.peek();  // Get the earliest made request

        if (currentFloor < target){  // Move the elevator up
            currentFloor++;
        }
        else if (currentFloor > target){  // Move the elevator down
            currentFloor--;
        }
        else {
            targets.poll();  // Get and remove the top element
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