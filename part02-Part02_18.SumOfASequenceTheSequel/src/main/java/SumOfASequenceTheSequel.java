
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int sumNumbers = 0;

        System.out.println("First Number?");
        firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Last Number?");
        secondNumber = Integer.valueOf(scanner.nextLine());
        int counter = firstNumber + 1;

        while (counter <= secondNumber) {

            firstNumber = firstNumber + counter;
            counter++;
        }
        System.out.println("The sum is : " + firstNumber);

    }
}
