public class Task {
    
    private int taskId;
    private String taskName;
    private boolean isCompleted;

    /**
     * Constructor to create a new Task object.
     * @param taskId Unique identifier for the task
     * @param taskName Description of the task
     */

    public Task(int taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
        isCompleted = false;
    }

    public int getTaskId() {
        return taskId;
    }
    public String getTaskName() {
        return taskName;
    }
    public boolean getIsComplete() {
        return isCompleted;
    }

    public void setTaskName(String newTaskName) {
        this.taskName = newTaskName;
    }

    public void setIsCompleted(boolean newIsComplete) {
        this.isCompleted = newIsComplete;
    }

    @Override
    public String toString() {
        String status = isCompleted ? "[✓]" : "[ ]";
        return "ID: " + taskId + " " + status + " " + taskName;
    } 
}