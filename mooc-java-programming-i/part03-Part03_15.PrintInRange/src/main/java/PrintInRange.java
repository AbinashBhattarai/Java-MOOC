
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        int lowerLimit = 1;
        int upperLimit = 6;
        System.out.println("The numbers in the range " + lowerLimit + " and " + upperLimit + " are:");
        printNumbersInRange(numbers, lowerLimit, upperLimit);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int low, int high) {
        for(int num : numbers) {
            if(num >= low && num <= high) {
                System.out.println(num);
            }
        }
    }
    
}
