public class Task {
    private String taskDescription;
    private boolean isCompleted = false;

    public Task(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Task(String taskDescription, boolean isCompleted) {
        this.taskDescription = taskDescription;
        this.isCompleted = isCompleted;
    }

    protected String returnDescription(){
        String cross = " ";
        if (isCompleted) {
            cross = "X";
        }
        return "[" + cross + "] " + this.taskDescription;
    }

    protected String toWriteFile() {
        String cross = "false";
        if (isCompleted) {
            cross = "true";
        }
        return cross + " , " + this.taskDescription;
    }

    protected void markTask() {
        this.isCompleted = true;
    }

    protected void unmarkTask() {
        this.isCompleted = false;
    }
}
