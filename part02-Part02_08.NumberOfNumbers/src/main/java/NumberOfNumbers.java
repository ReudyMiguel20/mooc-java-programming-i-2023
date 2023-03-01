
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        int totalNumbers = 0;
        
        while(true){
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0){
                break;
            } else if (number < 0 || number > 0) {
                totalNumbers = totalNumbers + 1;
                continue;
            } 
            
        }
        System.out.println("Number of numbers: " + totalNumbers);

    }
}
