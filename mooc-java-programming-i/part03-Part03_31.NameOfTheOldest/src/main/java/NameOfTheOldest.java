
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldestName = "";
        int oldestAge = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] splitInput = input.split(",");
            if (Integer.valueOf(splitInput[1]) > oldestAge) {
                oldestAge = Integer.valueOf(splitInput[1]);
                oldestName = splitInput[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
