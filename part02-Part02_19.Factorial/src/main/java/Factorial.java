
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int factorial = 1;
        int counter = 1;

        System.out.println("Give a number:");
        number = Integer.valueOf(scanner.nextLine());

        while (counter <= number) {
            factorial *= counter;
            counter++;
        }
        System.out.println(factorial);

    }
}
