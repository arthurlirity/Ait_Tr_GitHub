import java.util.Scanner;

public class UserInterface {
    private TaskManager taskManager;
    private Scanner scanner;

    public UserInterface(TaskManager taskManager) {
        this.taskManager = taskManager;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Просмотреть список задач");
            System.out.println("3. Удалить задачу");
            System.out.println("4. Выход");
            System.out.print("Ваш выбор: ");
            int choice = readInt();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    System.out.println("Завершение работы программы...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }

    private void addTask() {
        System.out.print("Введите задачу: ");
        String task = scanner.nextLine();
        taskManager.addTask(task);
        System.out.println("Задача добавлена.");
    }

    private void viewTasks() {
        if (taskManager.getTasks().isEmpty()) {
            System.out.println("Список задач пуст.");
        } else {
            System.out.println("\nСписок задач:");
            for (int i = 0; i < taskManager.getTasks().size(); i++) {
                System.out.println((i + 1) + ". " + taskManager.getTasks().get(i));
            }
        }
    }

    private void removeTask() {
        if (taskManager.getTasks().isEmpty()) {
            System.out.println("Список задач пуст. Нечего удалять.");
            return;
        }

        viewTasks();
        System.out.print("Введите номер задачи для удаления: ");
        int index = readInt() - 1;
        taskManager.removeTask(index);
        System.out.println("Задача удалена.");
    }

    private int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.println("Введите корректное число.");
            scanner.next();
        }
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
}
