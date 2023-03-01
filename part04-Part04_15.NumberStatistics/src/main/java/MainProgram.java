
import java.util.Scanner;

public class MainProgram {

    private int sumEvenNumbers;
    private int sumOddNumbers;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statisticsTotal = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();

        System.out.println("Enter numbers: ");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            statisticsTotal.addNumber(number);

            if (number % 2 == 0) {
                statisticsEven.addNumber(number);
            } else {
                statisticsOdd.addNumber(number);
            }

        }

        System.out.println("Sum: " + statisticsTotal.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}
