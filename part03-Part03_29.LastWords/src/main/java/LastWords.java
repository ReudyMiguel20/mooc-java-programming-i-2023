
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        String[] text = input.split(" ");
        
        int lastIndex = 0;
        
        while (true) {
            if (input.equals("")) {
                break;
            } 
            lastIndex = text.length - 1;
            System.out.println(text[lastIndex]);
            input = scanner.nextLine();
            text = input.split(" ");
            lastIndex = 0;
            
        }


    }
}
