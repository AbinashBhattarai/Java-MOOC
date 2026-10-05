
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] splitInput = input.split(",");
            if (Integer.valueOf(splitInput[1]) > oldestAge) {
                oldestAge = Integer.valueOf(splitInput[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldestAge);
    }
}
