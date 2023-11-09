package TskMgr;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private User user;
    private List<Task> taskList;


    public TaskManager(User user) {
        this.user = user;
        this.taskList = new ArrayList<>();
    }



    public void addTask(Task task) {
        taskList.add(task);
        System.out.println("task added: " + task.getTitle());
    }

    public void deleteTask(int taskId) {
        for (Task task : taskList) {
            if (task.getId() == taskId) {
                taskList.remove(task);
                System.out.println("Task Id " + taskId + " deleted.");
            }else {
                System.out.println("Task Id " + taskId + " does not exist.");
            }

        }

    }

    public void viewPendingTasks() {
        System.out.println("Pending tasks for " + user.getUsername() + ":");
        for (Task task : taskList) {
            if (!task.isCompleted()) {
                System.out.println("Task id: " + task.getId());
                System.out.println("Title: " + task.getTitle());
                System.out.println("Description: " + task.getDescription());
            }

        }
    }
}

