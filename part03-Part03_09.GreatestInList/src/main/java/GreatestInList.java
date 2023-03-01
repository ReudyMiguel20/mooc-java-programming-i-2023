
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement finding the greatest number in the list here
        int numberList = list.size();
        int greatestNumber = list.get(0);
        int counter = 0;
        int number = 0;

        while (counter < numberList) {
            number = list.get(counter);
            if (greatestNumber < number) {
                greatestNumber = number;
            }
            counter++;
        }
        
        
        System.out.println("The greatest number: " + greatestNumber);
    }

}
