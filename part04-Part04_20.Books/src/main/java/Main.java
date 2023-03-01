
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title:");
            String bookName = scanner.nextLine();

            if (bookName.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            String bookPages = scanner.nextLine();
            System.out.println("Publication year: ");
            String publicationBookYear = scanner.nextLine();

            books.add(new Book(bookName, bookPages, publicationBookYear));
        }
        
        System.out.println("What information will be printed?");
        String askQuestion = scanner.nextLine();
        
        if (askQuestion.equals("everything")){
            for (Book listBooks : books) {
                System.out.println(listBooks);
            }
        } else if (askQuestion.equals("name")){
            for (Book listBooks : books){
                System.out.println(listBooks.getBookName());
            }
        }

    }
}
