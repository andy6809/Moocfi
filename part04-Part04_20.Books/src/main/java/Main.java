
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        // implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            String published = scanner.nextLine();

            books.add(new Book(title, pages, published));
        }
        System.out.println("");
        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();
        for (Book book : books) {
            if (input.equals("everything")) {
                System.out.println(book);
            } else if(input.equals("name")) {
                System.out.println(book.getName());
            }

        }

    }
}
