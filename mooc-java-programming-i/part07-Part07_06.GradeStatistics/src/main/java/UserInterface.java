import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeStatistics gradeStatistics;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.gradeStatistics = new GradeStatistics();
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals(" ") || input.equals("-1")) {
                break;
            }

            int point = Integer.valueOf(input);
            this.gradeStatistics.addPoints(point);
        }
        gradeStatistics.print();
    }
}
