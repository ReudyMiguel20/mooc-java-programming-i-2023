
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int inputNumber;
        int inputNumberTwo;
        int number = 1;
        System.out.println("Where to?");
        inputNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        inputNumberTwo = Integer.valueOf(scanner.nextLine());

        while (inputNumberTwo <= inputNumber) {
            System.out.println(inputNumberTwo);
            inputNumberTwo++;
        }
    }
}
