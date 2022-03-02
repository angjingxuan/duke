
public class Deadline extends Task {

    protected String taskType = "D";
    protected String by;

    public Deadline(String description) {
        super(description.substring(0,description.lastIndexOf("/") -1).trim());
        this.by = description.substring(description.lastIndexOf("/") + 3, description.length()).trim();
    }

    @Override
    public void getTask () {
        System.out.println("[" + taskType + "] [" + getStatusIcon() + "] " + getDescription() + " (by: " + by + ")");
    }

}