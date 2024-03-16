import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View List");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String newItem = scanner.nextLine();
                    todoList.add(newItem);
                    System.out.println("Item added!");
                    break;
                case 2:
                    System.out.print("Enter index of item to remove: ");
                    int indexToRemove = scanner.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < todoList.size()) {
                        todoList.remove(indexToRemove);
                        System.out.println("Item removed!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    if (todoList.isEmpty()) {
                        System.out.println("List is empty!");
                    } else {
                        System.out.println("\n--- To-Do List ---");
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
