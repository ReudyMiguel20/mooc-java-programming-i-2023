
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> itemArrayList = new ArrayList<>();

        while (true) {

            System.out.println("Identifier? (empty will stop)");
            String identifierString = scanner.nextLine();
            if (identifierString.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String itemString = scanner.nextLine();
            if (itemString.isEmpty()) {
                break;
            }

            Items item = new Items(identifierString, itemString);

            if (!(itemArrayList.contains(item))) {
                itemArrayList.add(item);
            }

           

        }

        for (Items item2 : itemArrayList) {
            System.out.println(item2);
        }

    }
}
