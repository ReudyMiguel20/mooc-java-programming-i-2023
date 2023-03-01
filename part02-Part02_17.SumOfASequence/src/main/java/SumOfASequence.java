
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sumNumbers = 0;
        int counter = 0;

        System.out.println("Last number?");
        number = Integer.valueOf(scanner.nextLine());

        while (counter <= number) {
            sumNumbers = sumNumbers + counter;
            counter++;
        }
        System.out.println("The sum is " + sumNumbers);
    }
}
