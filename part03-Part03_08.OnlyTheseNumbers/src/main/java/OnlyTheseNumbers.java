
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        
        
        System.out.println("From Where?");
        int fromWhereNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("To Where?");
        int toWhereNumber = Integer.valueOf(scanner.nextLine());
        
        
        while (fromWhereNumber <= toWhereNumber) {
            
            System.out.println(numbers.get(fromWhereNumber));
            fromWhereNumber++;
        }
        
//        for (int i = 0; i <= toWhereNumber; i++) {
//        System.out.println(numbers.get(i));
//        }
    }
}
