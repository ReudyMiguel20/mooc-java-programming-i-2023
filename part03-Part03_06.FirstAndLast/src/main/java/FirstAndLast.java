
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        int firstString = 0;
        int lastString;
        lastString = list.size() - 1;
        
        System.out.println(list.get(firstString));
        System.out.println(list.get(lastString));

    }
}
