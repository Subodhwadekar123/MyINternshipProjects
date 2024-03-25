import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'The Quest for the Lost Treasure'!");
        System.out.println("You stand at the edge of Darkwood Forest, ready to begin your quest.");
        System.out.println("What will you do?");
        System.out.println("1. Enter the forest and follow the winding path.");
        System.out.println("2. Wait at the edge of the forest and observe your surroundings.");
        System.out.print("Enter your choice: ");

        int choice = getUserChoice(scanner, 1, 2);
        scanner.nextLine(); // Consume the newline character

        if (choice == 1) {
            // Scenario 1: Enter the forest
            System.out.println("You decide to enter the forest and follow the winding path.");
            System.out.println("As you venture deeper into the forest, you encounter a fork in the road.");
            System.out.println("What will you do?");
            System.out.println("1. Take the left path.");
            System.out.println("2. Take the right path.");
            System.out.print("Enter your choice: ");

            int forkChoice = getUserChoice(scanner, 1, 2);
            scanner.nextLine(); // Consume the newline character

            if (forkChoice == 1) {
                // Outcome 1: Left path
                System.out.println("You choose to take the left path.");
                System.out.println("You stumble upon an old cabin where a friendly hermit offers you guidance.");
                System.out.println("He gives you a map that leads to a hidden shortcut through the forest.");
                System.out.println("Congratulations! You've found the shortcut and made a new friend.");
            } else {
                // Outcome 2: Right path
                System.out.println("You choose to take the right path.");
                System.out.println("The path leads you deeper into the heart of the forest, where you encounter a fierce wolf.");
                System.out.println("You manage to scare off the wolf with a loud roar and continue your journey.");
                System.out.println("After a long trek, you reach a clearing with a mysterious stone altar.");
                System.out.println("You find a clue etched into the altar, leading you closer to the treasure.");
                System.out.println("Well done! You've overcome the challenges and discovered a valuable clue.");
            }
        } else {
            // Scenario 2: Wait at the edge
            System.out.println("You decide to wait at the edge of the forest and observe your surroundings.");
            System.out.println("While waiting, you notice a hidden cave entrance concealed by vines.");
            System.out.println("What will you do?");
            System.out.println("1. Investigate the cave entrance.");
            System.out.println("2. Ignore the cave and continue into the forest.");
            System.out.print("Enter your choice: ");

            int caveChoice = getUserChoice(scanner, 1, 2);
            scanner.nextLine(); // Consume the newline character

            if (caveChoice == 1) {
                // Outcome 3: Investigate the cave
                System.out.println("You decide to investigate the cave entrance.");
                System.out.println("Inside the cave, you find ancient carvings that reveal a hidden path.");
                System.out.println("You follow the path and discover a hidden chamber with a treasure chest.");
                System.out.println("Congratulations! You've found the Lost Treasure of Eldoria!");
            } else {
                // Outcome 4: Ignore the cave
                System.out.println("You choose to ignore the cave entrance and continue into the forest.");
                System.out.println("After a while, you stumble upon a group of bandits blocking your path.");
                System.out.println("You bravely confront the bandits and manage to negotiate safe passage.");
                System.out.println("You continue your journey with caution, avoiding further confrontations.");
                System.out.println("You may not have found the treasure, but you've successfully navigated the dangers.");
            }
        }

        scanner.close();
    }

    private static int getUserChoice(Scanner scanner, int minChoice, int maxChoice) {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < minChoice || choice > maxChoice) {
                    throw new IllegalArgumentException();
                }
                break; // Input is valid, exit the loop
            } catch (IllegalArgumentException e) {
                System.out.print("Invalid input. Please enter a valid choice: ");
            }
        }
        return choice;
    }
}
