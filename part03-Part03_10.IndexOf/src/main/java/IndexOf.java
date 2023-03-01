
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

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

        // implement here finding the indices of a number
        System.out.println("Search for?");
        int input2 = Integer.valueOf(scanner.nextLine());
        int input2Index = list.indexOf(input2);
        int numberList;
        int listSize = list.size();
        int counter = 0;

        while (counter < listSize) {
            numberList = list.get(counter);
            if (numberList == input2) {
                System.out.println(input2 + " is at index " + input2Index);
                input2Index++;
            }
            counter++;
        }

    }
}
