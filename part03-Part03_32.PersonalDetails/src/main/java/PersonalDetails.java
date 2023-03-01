
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Reading user input
        String input = scanner.nextLine();

        String[] text = input.split(",");

        int counter = 0;
        int years = Integer.valueOf(text[1]);
        int yearsSum = 0;
        yearsSum += years;
        counter++;
        int longestNameNumber = 0;
        String longestName = "";
        

        while (true) {
            //This determines the length of the string input by the user.
            //So like this we know which string is the longest.
            if (text[0].length() > longestNameNumber) {
                longestNameNumber = text[0].length();
                longestName = text[0];
            }

            //Ask the user for input again.
            input = scanner.nextLine();
            
            //Remember to split up the array again.
            text = input.split(",");
            
            //if input is empty, program will end.
            if (input.equals("")) {
                break;
            }
            
            //The sum of all the years, so later we can print the average.
            years = Integer.valueOf(text[1]);
            yearsSum += years;
            counter++;

        }

        double averageYears = (1.0 * yearsSum) / counter;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageYears);
    }
}
