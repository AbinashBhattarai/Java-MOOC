
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.valueOf(scanner.nextLine());

        // int start = 0;
        // while(start <= num) {
        //     System.out.println(start);
        //     start++;
        // }

        for(int i = 0; i <= num; i++) {
            System.out.println(i);
        }

    }
}
