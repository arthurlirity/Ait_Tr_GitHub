import java.util.ArrayList;

class ToDoList {
    private String name;
    private ArrayList<Task> tasks;

    public ToDoList(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void moveTask(Task task, ToDoList toDoList) {
        removeTask(task);
        toDoList.addTask(task);
    }

    public void printTasks() {
        System.out.println("Tasks in " + name + ":");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i).toString());
        }
    }
}
