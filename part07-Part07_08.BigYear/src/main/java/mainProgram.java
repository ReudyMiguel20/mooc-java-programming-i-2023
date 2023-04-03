
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Birds> birdList = new ArrayList<>();

        while (true) {
            System.out.println("?");
            String input = scan.nextLine();

            if (input.equals("Add")) {

                System.out.println("Name:");
                input = scan.nextLine();
                String birdName = input;
                System.out.println("Name in Latin?");
                input = scan.nextLine();
                String birdNameLatin = input;

                birdList.add(new Birds(birdName, birdNameLatin, 0));

            } else if (input.equals("Observation")) {
                System.out.println("Bird?");
                input = scan.nextLine();

                for (int i = 0; i < birdList.size(); i++) {
                    if (birdList.get(i).getBirdName().equals(input)) {
                        birdList.get(i).increaseBirdCounter();
                        break;
                    }
                    if (!(birdList.get(i).getBirdName().equals(input))) {
                        System.out.println("Not a bird!");
                    }

                }

            } else if (input.equals("All")) {
                for (Birds birds : birdList) {
                    System.out.println(birds);
                }
            } else if (input.equals("One")) {
                System.out.println("Bird?");
                input = scan.nextLine();

                for (int i = 0; i < birdList.size(); i++) {
                    if (birdList.get(i).getBirdName().equals(input)) {
                        System.out.println(birdList.get(i));
                    }
                }
            } else if (input.equals("Quit")) {
                break;
            }

        }
    }
}
