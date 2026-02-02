import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        boolean isRunning = true;

        System.out.println("=== TASK MANAGER APPLICATION ===\n");

        while (isRunning) {
            displayMenu();

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter task description: ");
                    String name = scanner.nextLine();

                    if (name.equals("")) {
                        System.out.println("\nTask description cannot be empty!\n");
                    } else {
                        taskManager.addTask(name);
                    }
                    break;
                }
                case 2 -> {
                    taskManager.viewTask();
                    break;
                }
                case 3 -> {
                    if (taskManager.isEmpty()) {
                        System.out.println("\nNo tasks available. Add some tasks first!\n");
                    } else {
                        System.out.print("Enter task ID to mark as completed: ");
                        int completedId = scanner.nextInt();
                        scanner.nextLine();

                        if (taskManager.markTaskAsCompleted(completedId)) {
                            System.out.println("\nTask marked as completed!\n");
                        } else {
                            System.out.println("\nTask not found! Please check the ID.\n");
                        }
                    }
                    break;
                }
                case 4 -> {
                    if (taskManager.isEmpty()) {
                        System.out.println("\nNo tasks available. Add some tasks first!\n");
                    } else {
                        System.out.print("Enter task ID to delete: ");
                        int deleteId = scanner.nextInt();
                        scanner.nextLine();

                        if (taskManager.deleteTask(deleteId)) {
                            System.out.println("\nTask deleted successfully!\n");
                        } else {
                            System.out.println("\nTask not found! Please check the ID.\n");
                        }
                    }
                    break;
                }
                case 5 -> {
                    System.out.println("\nExiting Task Manager. Goodbye!\n");
                    isRunning = false;
                    break;
                }

                default -> {
                    System.out.println("\nInvalid choice! Please enter a number between 1 and 5.\n");
                    break;
                }
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("===== MAIN MENU =====");
        System.out.println("1. Add Task");
        System.out.println("2. View All Tasks");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit Program");
        System.out.println("=====================");
        System.out.println();
    }
}