
import java.util.ArrayList;

import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);

        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int counter = 0;
        int counter2 = 0;
        int number = 0;
        int number2 = 0;
        int smallestNumber = list.get(0);
        int listSize = list.size();

        //Finding the smallest number on the ArrayList then print it
        while (counter < listSize) {
            number = list.get(counter);
            if (smallestNumber > number) {
                smallestNumber = number;
            }
            counter++;
        }

        System.out.println("Smallest number: " + smallestNumber);

        /*   verify-indexOf  of the smallestNumber,  
              where is the smallest Number located??      */
        int indexNumber = list.indexOf(smallestNumber);

        while (counter2 < listSize) {
            number2 = list.get(counter2);
            if (smallestNumber == number2) {
                System.out.println("Found at index: " + indexNumber);
                indexNumber++;
            }
            counter2++;
        }

    }
}
