public class Task {
    private String title;
    private boolean isCompleted;

    public Task(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    public void markCompleted() {
        isCompleted = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    @Override
    public String toString() {
        return title + " - " + (isCompleted ? "Completed" : "Pending");
    }
}