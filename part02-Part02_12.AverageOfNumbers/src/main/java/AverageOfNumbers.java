
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sumNumbers = 0;
        int countNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number < 0 || number > 0) {
                sumNumbers = sumNumbers + number;
                countNumbers = countNumbers + 1;
            }
        }
        double averageNumbers;
        averageNumbers = 1.0 * sumNumbers / countNumbers;
        System.out.println("Average of the numbers: " + averageNumbers);

    }
}
