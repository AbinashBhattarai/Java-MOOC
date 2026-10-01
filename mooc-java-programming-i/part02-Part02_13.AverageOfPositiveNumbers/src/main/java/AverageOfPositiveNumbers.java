
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveNumCount = 0;
        int positiveNumSum = 0;

        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if(num == 0) {
                break;
            }

            if(num > 0) {
                positiveNumCount++;
                positiveNumSum += num;
            }
        }

        if(positiveNumCount > 0) {
            System.out.println((1.0 * positiveNumSum/positiveNumCount));
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
