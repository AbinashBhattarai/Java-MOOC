
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = Double.valueOf(scanner.nextLine());
        System.out.println("Enter second number:");
        double num2 = Double.valueOf(scanner.nextLine());

        double sqrt = Math.sqrt(num1 + num2);
        System.out.println(sqrt);

    }
}
