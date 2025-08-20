 import java.util.*;

public class TaskManager {
    private Map<String, List<Task>> taskLists = new HashMap<>();

    public void createList(String listName) {
        taskLists.putIfAbsent(listName, new ArrayList<>());
    }

    public void addTask(String listName, String title) {
        createList(listName);
        taskLists.get(listName).add(new Task(title));
    }

    public void completeTask(String listName, int index) {
        List<Task> list = taskLists.get(listName);
        if (list != null && index >= 0 && index < list.size()) {
            list.get(index).markCompleted();
 } else {
            System.out.println("Invalid list name or task number.");
        }
    }

    public void showTasks(String listName) {
        List<Task> list = taskLists.get(listName);
        if (list != null) {
            System.out.println("[" + listName + "] list:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + ". " + list.get(i));
            }
        } else {
            System.out.println("List does not exist.");
        }
    }

    public void showAllLists() {
        for (String name : taskLists.keySet()) {
            showTasks(name);
        }
    }
}