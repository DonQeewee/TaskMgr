package TskMgr;

import java.util.ArrayList;
import java.util.List;

public class TaskManager<Task> {

    private User user;
    private List<Task> taskList;

    public <Task> TaskManager(User user, List<Task> taskList) {
        this.user = user;
        this.taskList = new ArrayList<>();
    }

    public TaskManager() {

    }

    public void addTask(Task task) {
        taskList.add(task);
        System.out.println("task added" + task.getTitle));
    }

    public void deleteTask(int taskId) {
        for (Task task : taskList) {
            if (Task.getId == taskId) {
                taskList.remove(task);
                System.out.println("Task Id " + taskId + " deleted.");
            }
        }
        System.out.println("Task Id " + taskId + " does not exist.");
    }

    public void viewPendingTasks() {
        System.out.println("Pending tasks for " + user.getUsername() + ":");
        for (Task task : taskList) {
            if (!task.isCompleted) {
                System.out.println("Task id: " + task.getId());
                System.out.println("Title: " + task.getTitle());
                System.out.println("Description: " + task.getDescription());
            }

        }
    }
}

