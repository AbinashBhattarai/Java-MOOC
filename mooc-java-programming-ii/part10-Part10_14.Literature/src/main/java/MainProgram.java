
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, age));
        }

        Comparator<Book> comparator = Comparator
                                        .comparing(Book::getAge)
                                        .thenComparing(Book::getname);
        
        books.sort(comparator);

        System.out.println(books.size() + " books in total.");
        System.out.println("");
        System.out.println("Books:");
        books.stream().forEach(b -> System.out.println(b));
    }

}
