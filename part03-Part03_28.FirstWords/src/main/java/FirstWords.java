
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        String[] text = input.split(" ");
        
        int counter = 0;
        
        while (true) {
            if (input.equals("")){
                break;
            } else {
                System.out.println(text[counter]);
                input = scanner.nextLine();
                text = input.split(" ");
                counter = 0;
            }
            
            
            
        }


    }
}
