import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            addCommand();
        } else if (command.equals("search")) {
            searchCommand();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void addCommand() {
        System.out.print("Word: ");
        String word = this.scanner.nextLine();

        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();

        this.simpleDictionary.add(word, translation);
    }

    public void searchCommand() {
        System.out.print("To be translated: ");
        String search = this.scanner.nextLine();

        String searchResult = this.simpleDictionary.translate(search);
        if (searchResult == null) {
            System.out.println("Word " + search + " was not found");
        } else {
            System.out.println("Translation: " + searchResult);
        }
    }
}