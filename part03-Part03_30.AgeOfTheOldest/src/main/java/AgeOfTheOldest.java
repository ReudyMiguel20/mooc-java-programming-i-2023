
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] text = input.split(",");

        int oldestAge = 0;
        int number = Integer.valueOf(text[1]);

        while (true) {
            if (number > oldestAge) {
                oldestAge = number;
            } 
            
            input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            } else {
                text = input.split(",");
                number = Integer.valueOf(text[1]);
            }
        }

        System.out.println("Age of the oldest: " + oldestAge);

    }
}
