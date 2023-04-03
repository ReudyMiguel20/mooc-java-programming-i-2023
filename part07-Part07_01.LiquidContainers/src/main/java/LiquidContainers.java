
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
//            System.out.print("> ");
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (parts[0].equals("add")) {
                if (amount < 0) {
                    firstContainer = firstContainer;
                } else if (amount > 0) {
                    firstContainer += amount;
                }

                if (firstContainer >= 100) {
                    firstContainer = 100;
                }

            } else if (parts[0].equals("move")) {
                if (amount < 0) {
                    secondContainer = secondContainer;

                } else if (amount > 0 && firstContainer > 0) {

                    int substraction = firstContainer - amount;

                    if (substraction <= 0) {
                        secondContainer += firstContainer;
                        firstContainer -= amount;
                    } else if (substraction > 0) {
                        secondContainer += amount;
                        firstContainer = substraction;
                    }

                    if (firstContainer < 0) {
                        firstContainer = 0;
                    }

                }
                if (secondContainer >= 100) {
                    secondContainer = 100;
                    firstContainer = 0;
                }
            } else if (parts[0].equals("remove")) {
                
                if (secondContainer < 0){
                    secondContainer = secondContainer;
                } else if (secondContainer > 0){
                    secondContainer -= amount;
                    if (secondContainer < 0){
                        secondContainer = 0;
                    }
                }

            }

        }

    }

}
