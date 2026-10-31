
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you may try out your class here
        Pipe<Integer> numberPipe = new Pipe<>();
        numberPipe.putIntoPipe(1);
        numberPipe.putIntoPipe(2);
        numberPipe.putIntoPipe(3);

        int sum = 0;
        while(numberPipe.isInPipe()) {
            sum = sum + numberPipe.takeFromPipe();
        }
        System.out.println(sum);
        numberPipe.putIntoPipe(4);
        System.out.println(numberPipe.takeFromPipe());
        System.out.println(numberPipe.takeFromPipe());
    }
}
