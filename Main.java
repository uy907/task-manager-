 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Task Manager!");

        while (true) {
            System.out.println("\nEnter a command: [add, done, list, all, exit]");
            command = scanner.nextLine();

            if (command.equals("add")) {
                System.out.print("List name: ");
                String listName = scanner.nextLine();

                System.out.print("Task title: ");
 String title = scanner.nextLine();

                manager.addTask(listName, title);

            } else if (command.equals("done")) {
                System.out.print("List name: ");
                String listName = scanner.nextLine();

                System.out.print("Completed task number: ");
                int index = Integer.parseInt(scanner.nextLine());

                manager.completeTask(listName, index);

            } else if (command.equals("list")) {
                System.out.print("List name: ");
                String listName = scanner.nextLine();

                manager.showTasks(listName);

            } else if (command.equals("all")) {
                manager.showAllLists();

            } else if (command.equals("exit")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }

        scanner.close();
    }
}