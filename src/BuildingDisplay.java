public class BuildingDisplay {
    private final int floors;

    public BuildingDisplay(int floors) {
        this.floors = floors;
    }

    public void render(int elevatorFloor) {
        clearScreen();
        for (int floor = floors - 1; floor >= 0; floor--) {
            if (floor == elevatorFloor) {
                System.out.printf("Floor %2d | [E]%n", floor);
            } else {
                System.out.printf("Floor %2d |%n", floor);
            }
        }
        System.out.println("----------------");
    }

    private void clearScreen() {
        // ANSI escape codes — works on most terminals (Linux/macOS/WSL)
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
