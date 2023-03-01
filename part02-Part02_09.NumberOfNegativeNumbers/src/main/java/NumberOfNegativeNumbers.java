
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        int totalNegativeNumbers = 0;
        
        while(true){
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            if (number == 0){
                break;
            } else if (number > 0) {
                continue;
            } else if (number < 0) {
                totalNegativeNumbers = totalNegativeNumbers + 1;
                continue;
            }
        }
        System.out.println("Number of negative numbers: " + totalNegativeNumbers);
    }
}
