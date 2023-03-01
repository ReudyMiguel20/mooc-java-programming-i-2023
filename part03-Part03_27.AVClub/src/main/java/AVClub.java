
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] text = input.split(" ");

        int index = 0;
        int counter = 0;

        while (true) {
            if (input.isEmpty()) {
                break;
            } else if (index == text.length) {
                input = scanner.nextLine();
                text = input.split(" ");
                counter = 0;
                index = 0;
            } else if (index < text.length) {
                if (text[counter].contains("av")) {
                    System.out.println(text[counter]);
                    counter++;
                    index++;
                } else {
                    counter++;
                    index++;
                }
            }

        }

    }
}
