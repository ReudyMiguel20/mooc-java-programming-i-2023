
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //Splits the text by a space everytime the array gets printed
        String[] text = input.split(" ");

        int index = 0;
        int counter = 0;

        while (true) {
            //this ends the program when the user input is null
            if (input.isEmpty()) {
                break;
            }
            
            //this is for when the input gets to the end so it can receive another
            //input by the user, and it gonna begins from the start. If the user
            //input is null, then the program is gonna end.
            if (index == text.length) {
                input = scanner.nextLine();
                text = input.split(" ");
                counter = 0;
                index = 0;
                continue;
            }
            
            //this is going to print the string.
            if (index < text.length) {
                System.out.println(text[counter]);
                counter++;
                index++;
            }

        }

    }
}
