package TskMgr;

import TskMgr.TaskManager;
import TskMgr.User;

public class Main {

    public static void main(String[] args) {

        User user = new User("Ayo Fash");
        TaskManager taskManager = new TaskManager();

        Task task01 = new Task(001, "foundation set-out", "setting the poles and pole lines for foundation digging and laying");
        Task task02 = new Task(002, "foundation laying", "concrete mixing and laying of the foundation blocks");

        taskManager.addTask(task01);
        taskManager.addTask(task02);

        taskManager.viewPendingTasks();

        taskManager.deleteTask(1);

        taskManager.viewPendingTasks();

    }




}
