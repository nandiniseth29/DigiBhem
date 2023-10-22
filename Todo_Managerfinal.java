
import java.util.Scanner;

public class Todo_Managerfinal {

    public static void main(String[] args) {

        System.out.println("Welcome to your Todo Manager!\n");
        System.out.println("Please Enter your Name: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hello " + name);

        String choice = null;
        Scanner input = new Scanner(System.in);

        do {
            // Display the Menu
            System.out.println("\nPlease choose an option");
            System.out.println("1. Enter a task");
            System.out.println("2. Remove a task");
            System.out.println("3. Update a task");
            System.out.println("4. List all tasks");
            System.out.println("5. Exit");
            choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Enter a task: ");
                    String newTask = input.nextLine();
                    // Implement the logic for adding the task
                    break;
                // Implement the other options and logic as needed
            }
        } while (!choice.equals("5"));

        // Close the 'in' and 'input' Scanners to prevent resource leaks.
        in.close();
        input.close();
    }
}
