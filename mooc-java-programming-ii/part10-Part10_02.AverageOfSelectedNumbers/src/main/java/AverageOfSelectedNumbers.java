
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String read = scanner.nextLine();
            if (read.equals("end")) {
                break;
            }

            int input = Integer.valueOf(read);
            numbers.add(input);
        }

        double average = 0;
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String command = scanner.nextLine();

        if (command.equals("n")) {
            average = numbers.stream()
                        .mapToInt(i -> i)
                        .filter(num -> num < 0)
                        .average()
                        .getAsDouble();
        }

        if (command.equals("p")) {
            average = numbers.stream()
                        .mapToInt(i -> i)
                        .filter(num -> num >= 0)
                        .average()
                        .getAsDouble();
        }

        System.out.println(average);
    }
}
