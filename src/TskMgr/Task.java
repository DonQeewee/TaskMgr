package TskMgr;

public class Task {

    public static int getId = 0;
    private int id;
    private String title;
    private String description;
    private  boolean isCompleted;




    public Task(String title, String description) {
        this.id = ++getId;
        this.title = title;
        this.description = description;
        this.isCompleted = false;  //task completion status is pending by default.

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
