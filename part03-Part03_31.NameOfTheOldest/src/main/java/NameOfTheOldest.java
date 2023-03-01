
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] text = input.split(",");

        String oldestPerson = "";
        int oldestAge = 0;
        int age = Integer.valueOf(text[1]);

        while (true) {
            if (age > oldestAge) {
                oldestAge = age;
                oldestPerson = text[0];
            }
            
            input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            } else {
                text = input.split(",");
                age = Integer.valueOf(text[1]);
            }
        }
        System.out.println("Name of the oldest: " + oldestPerson);
    }
}
