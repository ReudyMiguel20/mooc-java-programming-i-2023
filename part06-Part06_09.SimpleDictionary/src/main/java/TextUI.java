
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");

            String input = this.scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye Bye!");
                break;
            } else if (input.equals("add")) {
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                System.out.println("Translation:");
                String translation = this.scanner.nextLine();
                dictionary.add(word, translation);
            } else if (input.equals("search")) {
                System.out.println("To be translated:");
                String wordToTranslate = this.scanner.nextLine();
                if (dictionary.contains(wordToTranslate)) {
                    System.out.println(dictionary.translate(wordToTranslate));
                } else {
                    System.out.println("Word " + wordToTranslate + " was not found");
                }
            } else {
                System.out.println("Unknown command");
            }
        }

    }
}
