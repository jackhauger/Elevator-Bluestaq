import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Building building = new Building(10);

        while (true) {
            System.out.println("\nEnter request (source destination), or q to quit:");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("q")) break;

            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Invalid input. Example: 2 7");
                continue;
            }

            int src = Integer.parseInt(parts[0]);
            int dst = Integer.parseInt(parts[1]);

            building.requestElevator(src, dst);

            while (!building.isIdle()) {
                building.step();
                Thread.sleep(500); // adjust for speed
            }
        }
        scanner.close();
    }
}
