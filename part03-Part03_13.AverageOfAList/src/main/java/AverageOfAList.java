
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Creating new ArrayList type int
        ArrayList<Integer> list = new ArrayList<>();

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        //Adding input for user, it stops when the user types -1.
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        
        int sum = 0;
        
        for (int numbers: list) {
            sum += numbers; 
        }
        
        int allNumbers = list.size();
        double average = 1.0 * sum / allNumbers;
        
        System.out.println("Average: " + average);
        
        
    }
}
