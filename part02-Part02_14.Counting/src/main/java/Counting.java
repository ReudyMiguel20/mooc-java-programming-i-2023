
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        number = Integer.valueOf(scanner.nextLine());
        int finishNumber = 0;

        while (finishNumber <= number) {
            System.out.println(finishNumber);
            finishNumber++;
        }

    }
}
