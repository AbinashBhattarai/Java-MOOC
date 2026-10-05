
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int ageCount = 0;
        int ageSum = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] splitInput = input.split(",");
            if (splitInput[0].length() > longestName.length()) {
                longestName = splitInput[0];
            }

            ageSum += Integer.valueOf(splitInput[1]);
            ageCount++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * ageSum / ageCount));
    }
}
