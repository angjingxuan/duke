
public class Event extends Task {

    protected String taskType = "E";
    protected int index = 0;

    public Event(String description) {
        super(description);
    }

    @Override
    public void getTask () {
        System.out.println("[" + taskType + "] [" + getStatusIcon() + "] " + getDescription());
    }

    /*public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public String getTaskType() { return (taskType); }

    public String getDescription() {
        return description;
    }

    public boolean getIsDone() { return isDone; }

    public void markAsDone() {
        isDone = true;
    }

    public void markAsNotDone() {
        isDone = false;
    }*/


}
