import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<ToDoList> toDoLists = new ArrayList<>();
    private static File file = new File("/Users/arthurlirity/Documents/GitHub/Ait_Tr_GitHub/Projects/code/ToDoList/src/todolist.txt");

    public static void main(String[] args) {
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
        }
        loadToDoLists();
        boolean exit = false;
        while (!exit) {
            System.out.println("Select an option:");
            System.out.println("1. Add a new list");
            System.out.println("2. View lists");
            System.out.println("3. Add a new task");
            System.out.println("4. View tasks");
            System.out.println("5. Remove a task");
            System.out.println("6. Move a task to another list");
            System.out.println("7. Exit");
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    addList();
                    break;
                case "2":
                    viewLists();
                    break;
                case "3":
                    addTask();
                    break;
                case "4":
                    viewTasks();
                    break;
                case "5":
                    removeTask();
                    break;
                case "6":
                    moveTask();
                    break;
                case "7":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        saveToDoLists();
        scanner.close();
    }

    private static void addList() {
        System.out.println("Enter the name of the new list:");
        String name = scanner.nextLine().trim();
        ToDoList toDoList = new ToDoList(name);
        toDoLists.add(toDoList);
        System.out.println("List " + name + " has been added.");
    }

    private static void viewLists() {
        if (toDoLists.isEmpty()) {
            System.out.println("There are no lists.");
            return;
        }
        System.out.println("Lists:");
        for (int i = 0; i < toDoLists.size(); i++) {
            System.out.println((i + 1) + ". " + toDoLists.get(i).getName() + " (" + toDoLists.get(i).getTasks().size() + " tasks)");
        }
    }

    private static void addTask() {
        if (toDoLists.isEmpty()) {
            System.out.println("There are no lists.");
            return;
        }
        ToDoList toDoList = selectToDoList();
        if (toDoList == null) {
            return;
        }
        System.out.println("Enter the name of the new task:");
        String name = scanner.nextLine().trim();
        System.out.println("Enter the deadline of the task (optional):");
        String deadline = scanner.nextLine().trim();
        Task task = deadline.isEmpty() ? new Task(name) : new Task(name, deadline);
        toDoList.addTask(task);
        System.out.println("Task " + name + " has been added to the list " + toDoList.getName() + ".");
    }

    private static void viewTasks() {
        if (toDoLists.isEmpty()) {
            System.out.println("There are no lists.");
            return;
        }
        ToDoList toDoList = selectToDoList();
        if (toDoList == null) {
            return;
        }
        toDoList.printTasks();
    }

    private static void removeTask() {
        if (toDoLists.isEmpty()) {
            System.out.println("There are no lists.");
            return;
        }
        ToDoList toDoList = selectToDoList();
        if (toDoList == null) {
            return;
        }
        if (toDoList.getTasks().isEmpty()) {
            System.out.println("There are no tasks in the list " + toDoList.getName() + ".");
            return;
        }
        Task task = selectTask(toDoList);
        if (task == null) {
            return;
        }
        toDoList.removeTask(task);
        System.out.println("Task " + task.getName() + " has been removed from the list " + toDoList.getName() + ".");
    }

    private static void moveTask() {
        if (toDoLists.size() < 2) {
            System.out.println("There are not enough lists to move a task.");
            return;
        }
        ToDoList fromList = selectToDoList();
        if (fromList == null) {
            return;
        }
        if (fromList.getTasks().isEmpty()) {
            System.out.println("There are no tasks in the list " + fromList.getName() + ".");
            return;
        }
        Task task = selectTask(fromList);
        if (task == null) {
            return;
        }
        ToDoList toList = selectToDoList("Enter the number of the list to move the task to:");
        if (toList == null || toList == fromList) {
            return;
        }
        fromList.moveTask(task, toList);
        System.out.println("Task " + task.getName() + " has been moved from the list " + fromList.getName() + " to the list " + toList.getName() + ".");
    }

    private static ToDoList selectToDoList() {
        return selectToDoList("Enter the number of the list:");
    }

    private static ToDoList selectToDoList;
    private static ToDoList selectToDoList(String prompt) {
        if (toDoLists.isEmpty()) {
            System.out.println("There are no lists.");
            return null;
        }
        System.out.println("Lists:");
        for (int i = 0; i < toDoLists.size(); i++) {
            System.out.println((i + 1) + ". " + toDoLists.get(i).getName() + " (" + toDoLists.get(i).getTasks().size() + " tasks)");
        }
        System.out.println(prompt);
        int choice;
        try {
            choice = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            return null;
        }
        if (choice < 1 || choice > toDoLists.size()) {
            System.out.println("Invalid input.");
            return null;
        }
        return toDoLists.get(choice - 1);
    }

    private static Task selectTask(ToDoList toDoList) {
        System.out.println("Tasks in " + toDoList.getName() + ":");
        ArrayList<Task> tasks = toDoList.getTasks();
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i).toString());
        }
        System.out.println("Enter the number of the task:");
        int choice;
        try {
            choice = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            return null;
        }
        if (choice < 1 || choice > tasks.size()) {
            System.out.println("Invalid input.");
            return null;
        }
        return tasks.get(choice - 1);
    }

    private static void loadToDoLists() {
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\|");
                ToDoList toDoList = new ToDoList(parts[0]);
                String[] tasks = parts[1].split(",");
                for (String task : tasks) {
                    String[] taskParts = task.split(";");
                    Task newTask = new Task(taskParts[0], taskParts[1]);
                    toDoList.addTask(newTask);
                }
                toDoLists.add(toDoList);
            }
            fileScanner.close();
            System.out.println("ToDoList loaded from file.");
        } catch (IOException e) {
            System.out.println("An error occurred while loading the ToDoList.");
        }
    }

    private static void saveToDoLists() {
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (ToDoList toDoList : toDoLists) {
                fileWriter.write(toDoList.getName() + "|");
                ArrayList<Task> tasks = toDoList.getTasks();
                for (int i = 0; i < tasks.size(); i++) {
                    Task task = tasks.get(i);
                    fileWriter.write(task.getName() + ";" + task.getDeadline());
                    if (i < tasks.size() - 1) {
                        fileWriter.write(",");
                    }
                }
                fileWriter.write("\n");
            }
            fileWriter.close();
            System.out.println("ToDoList saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the ToDoList.");
        }
    }
}

