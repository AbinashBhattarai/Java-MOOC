import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int PublicationYear = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(title, pages, PublicationYear));
        }

        System.out.print("What information will be printed? ");
        String requirement = scanner.nextLine();

        for (Book book : bookList) {
            if (requirement.toLowerCase().equals("everything")) {
                System.out.println(book);
            } else if (requirement.toLowerCase().equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
