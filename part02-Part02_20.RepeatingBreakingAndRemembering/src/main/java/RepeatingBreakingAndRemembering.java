
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        int totalNumbers = 0;
        int oddNumber = 0;
        int evenNumber = 0;

        System.out.println("Give numbers:");
        number = Integer.valueOf(scanner.nextLine());

        while (true) {
            if (number < 0) {
                System.out.println("Thx Bye!");
                break;
            } else if (number > 0) {
                sum += number;
                totalNumbers++;
                if (number == 2 || number % 2 == 0) {
                    evenNumber++;
                } else {
                    oddNumber++;
                }
                number = Integer.valueOf(scanner.nextLine());
            }

        }

        double average = 1.0 * sum / totalNumbers;

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + totalNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumber);
        System.out.println("Odd: " + oddNumber);

    }
}
