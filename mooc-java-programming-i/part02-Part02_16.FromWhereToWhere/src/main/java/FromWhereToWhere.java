
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write your program here
        System.out.print("Where to? ");
        int target = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int start = Integer.valueOf(scanner.nextLine());

        if(target >= start) {
            for(int i = start; i <= target; i++) {
                System.out.println(i);
            }
        }

    }
}
