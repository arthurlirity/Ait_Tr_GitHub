public class Task {

    private String name;
    private String deadline;

    public Task(String name) {
        this.name = name;
        this.deadline = "";
    }

    public Task(String name, String deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return name + (deadline.isEmpty() ? "" : " (deadline: " + deadline + ")");
    }
}



