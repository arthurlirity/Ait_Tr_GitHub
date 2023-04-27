import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Список дел");

        // T0D0 - Список дел
        // Меню
        // добавить запись
        // просмотреть запись
        // удалить запись
        // выйти

        enum Menu {
            ADD,
            PRINT,
            DELETE,
            EXIT,
        }

        List<String> todoList = new ArrayList<>(); // инициализация списка листа со списком задач
        // начало работы с пользователем
        // while {true}
        while (true) { // Бесконечный цикл

            for (Menu myMenu : Menu.values()) { // цикл форич - список, который перебираем, параментр цикла, значение
                System.out.print(myMenu + " | "); // оператор с параментром цикла
            }

            System.out.println();
            System.out.println("Выберите, что надо сделать: нажмите 1,2,3 или 4");

            int choice = readMenueChoice(); // выбор пользователя считаем в метод readMenuChoice
            Menu myMenu = Menu.ADD; // начальное значение выбора в меню

            switch (choice) {
                case 1: {
                    myMenu = Menu.ADD;
                    add_task(todoList); // вызов метода, который добавляет задачу в список задач
                    print_tasks(todoList); // вызов метода, который печатает список задач
                    break;
                }
                case 2: {
                    myMenu = Menu.PRINT;
                    print_tasks(todoList);
                    break;
                }
                case 3: {
                    myMenu = Menu.DELETE;
                    remove_task (todoList);
                    break;
                }
                case 4: {
                    myMenu = Menu.EXIT;
                    System.out.println("Спасибо, до свидания");
                    return;
                }
                default:{
                    System.out.println("Введите число 1,2,3 или 4");
                }
            }
        }

    }

    // Метод, который считывает выбор пользователя из меню
    public static int readMenueChoice() {
        Scanner sc = new Scanner(System.in);
        int menuChoice = 0;
        try {
            menuChoice = sc.nextInt(); // изза того что next int не чистает ничего кроме чисел
        } catch (InputMismatchException e) {  // исключение из библиотеки на неправильный ввод символов
            System.out.println("Не вводите ссимволы");
        }

        return menuChoice;
    }


    // Метод для добавления задачи в список задач
    public static void add_task (List<String> tasks) {
        System.out.println("Введите задачу: ");
        Scanner sc = new Scanner(System.in);
        String task = sc.nextLine(); // счиали строку с задачей
        tasks.add(task); // в список tasks вносим методом ADD новое значание
    }


    // Метод для добавления задачи в список задач
    public static void print_tasks (List<String> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            int n = i + 1; // задаем номер задачи в списке
            System.out.println(n + ". " + tasks.get(i)); // печатаем задачу
            if (tasks.size() == 0) {
                System.out.println("Задач еще нет, начните их добавлять.");
            }
        }
    }


    // Метод для удаления задачи из списка по ее номеру
    public static void remove_task (List<String> tasks) {
        System.out.println("Выберите номер задачи для удаления: ");
        Scanner sc = new Scanner(System.in); // включили сканер
        int task_num = sc.nextInt();
        if (task_num >= 1 && task_num <= tasks.size()){ // проверка на ошибку
            int n = task_num - 1; // меняем на минус один, чтобы удалить задачу из списка
            tasks.remove(n); // удаляем задачу из списка с индексом
        } else {
            System.out.println("Выбран не верный номер задачи");
            return;
        }

    }

}



