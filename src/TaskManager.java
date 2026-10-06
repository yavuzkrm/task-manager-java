import java.util.ArrayList;

public class TaskManager {
    
    private ArrayList<Task> tasks;
    int taskId;

    public TaskManager() {
        tasks = new ArrayList<>();
        taskId = 1;
    }

    public void addTask(String taskName) {
        Task newTask = new Task(taskId, taskName);
        tasks.add(newTask);
        taskId++;
        System.out.println("\nTask added successfully!\n");
    }

    public void viewTask() {
        if (tasks.isEmpty()) {
            System.out.println("\nNo tasks available. Add some tasks first!\n");
            return;
        }

        System.out.println("\n=== ALL TASKS ===");
        for (Task task : tasks) {
            System.out.println(task); // Uses toString() method of Task class
        }
        System.out.println("=================\n");
    }

    public boolean markTaskAsCompleted(int searchTaskId) {
        Task task = findTask(searchTaskId);
        if (task == null) {
            return false;
        }
        task.setIsCompleted(true);
        return true;
    }

    public boolean deleteTask(int deleteTaskId) {
        Task task = findTask(deleteTaskId);
        if (task == null) {
            return false;
        }
        tasks.remove(task);
        return true;
    }

    public Task findTask(int searchTaskId) {
        for (Task task : tasks) {
            if (task.getTaskId() == searchTaskId) {
                return task;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        if (tasks.isEmpty()) {
            return true;
        }
        return false;
    }
}