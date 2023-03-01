
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int numbersInputted = 0;
        int numbersSum = 0;

        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number < 0 || number > 0) {
                numbersSum = numbersSum + number;
                numbersInputted = numbersInputted + 1;
            }

        }
        System.out.println("Number of numbers: " + numbersInputted);
        System.out.println("Sum of the numbers: " + numbersSum);

    }
}
