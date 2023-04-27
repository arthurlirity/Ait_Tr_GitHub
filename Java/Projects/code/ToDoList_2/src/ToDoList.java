public class ToDoList {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        UserInterface userInterface = new UserInterface(taskManager);
        userInterface.start();
    }
}