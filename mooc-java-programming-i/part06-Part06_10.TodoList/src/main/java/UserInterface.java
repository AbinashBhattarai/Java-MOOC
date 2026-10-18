import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                add();
            } else if (command.equals("list")) {
                list();
            } else if (command.equals("remove")) {
                remove();
            }
        }
    }

    public void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();    
        this.todoList.add(task);
    }

    public void list() {
        this.todoList.print();
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int id = Integer.valueOf(scanner.nextLine());
        this.todoList.remove(id);
    }
}